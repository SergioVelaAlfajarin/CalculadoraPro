package pro.calc.modelo;

import pro.calc.exception.CalcException;

public class Operacion implements Calculable {

    double num1;
    double num2;

    public Operacion() {
        num1 = 0;
        num2 = 0;
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    @Override
    public double calcular(String signo) {
        return switch (signo) {
            case "+" ->
                num1 + num2;
            case "-" ->
                num1 - num2;
            case "/" ->
                num1 / num2;
            case "*" ->
                num1 * num2;
            default ->
                throw new CalcException("Signo incorrecto");
        };
    }

}
