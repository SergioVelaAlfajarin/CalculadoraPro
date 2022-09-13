package pro.calc.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pro.calc.exception.CalcException;

public class GestorBD {

    //Creamos la conexion
    private static Connection conexion;

    //Lo iniciamos con la bbdd
    public static void init(
            String usuario,
            String contrasena,
            String bbdd,
            String url
    ) throws CalcException {
        try {
            conexion = DriverManager.getConnection(url + bbdd, usuario, contrasena);
        } catch (SQLException ex) {
            throw new CalcException(ex.getMessage());
        }
    }

    public static int escribeOperacion(String resFormatted) throws CalcException {

        String[] array = resFormatted.split("=");

        if (conexion == null) {
            throw new CalcException("La base de datos no esta inicializada.");
        }
        try {
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO operaciones (id, operacion, resultado) VALUES(?,?,?);");

            ps.setInt(1, sumarID());
            ps.setString(2, array[0]);
            ps.setString(3, array[1]);

            int resultado = ps.executeUpdate(); //guarda el resultado
            ps.close(); //cierra el preparedstatement
            return resultado; //devuelve el resultado
        } catch (SQLException ex) {
            throw new CalcException(ex.getMessage());
        }

    }

    private static int sumarID() throws CalcException {
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement("SELECT * FROM operaciones;");
            ResultSet rs = ps.executeQuery();
            int rows = 1;
            while (rs.next()) {
                rows++;
            }
            return rows;
        } catch (SQLException ex) {
            throw new CalcException(ex.getMessage());
        }
    }

    public static void borrarBBDD() throws CalcException {
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement("DELETE FROM operaciones;");
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new CalcException(ex.getMessage());
        }
    }

    public static void close() throws CalcException {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                throw new CalcException(e.getMessage());
            }
        }
    }
}
