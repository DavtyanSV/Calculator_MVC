public class CalculatorMain {
    public static void main(String[] args) throws IllegalAccessException {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        String sign = view.getOperation();
        double num1 = view.getOperand();
        double num2 = view.getOperand();

        controller.performOperation(sign, num1, num2);

    }
}

// абсолютно везде предлагает ввести throws IllegalAccessException
// без этого пишет что у кода ошибка. Почему?