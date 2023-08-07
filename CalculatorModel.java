/**
 * В данном классе соблюдается принцип SRP
 * Все методы касаются только работы с логикой (мат. операции)
 * Также классы закрыты для 
 */
public class CalculatorModel {

    double result;

    public void sum(double num1, double num2) {
        result = num1 + num2;
    }

    public void substract(double num1, double num2) {
        result = num1 - num2;
    }

    public void multiply(double num1, double num2) {
        result = num1 * num2;
    }

    public void divide(double num1, double num2) throws IllegalAccessException {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            throw new IllegalAccessException("На ноль делить нельзя");
        }
        result = num1 + num2;
    }

    public double getResult() {
        return result;

    }

}