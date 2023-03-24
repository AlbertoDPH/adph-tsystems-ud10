package ud10_04;

class Calculadora {
    // Métodos de cálculo
    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    //Metodo que controla la excepcion cuando se intenta dividir entre 0
    public double division(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return num1 / num2;
    }

    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double raizCuadrada(double num1) {
        return Math.sqrt(num1);
    }
    //Metodo para calcula la raiz cubica
    public double raizCubica(double num1) {
        return Math.cbrt(num1);
    }
}
