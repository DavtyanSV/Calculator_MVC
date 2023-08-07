import java.util.logging.Logger;

public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Добавили логер
     * 
     * @param log логгер
     */
    private static Logger log = Logger.getLogger(CalculatorController.class.getName());

    public void performOperation(String operation, double num1, double num2) throws IllegalAccessException {
        switch (operation) {
            case "+":
                model.sum(num1, num2);
                /**
                 * 
                 * @param log логгер записывает операцию сложения
                 */
                log.info("Провели операцию суммирование " + num1 + " и " + num1);
                break;
            case "-":
                model.substract(num1, num2);
                /**
                 * 
                 * @param log логгер записывает операцию вычитания
                 */
                log.info("Провели операцию вычитания " + num1 + " и " + num1);
                break;
            case "*":
                model.multiply(num1, num2);
                /**
                 * 
                 * @param log логгер записывает операцию умножения
                 */
                log.info("Провели операцию умножения " + num1 + " и " + num1);
                break;
            case "/":
                model.divide(num1, num2);
                /**
                 * 
                 * @param log логгер записывает операцию деления
                 */
                log.info("Провели операцию деления " + num1 + " и " + num1);
                break;
            default:
                System.out.println("Неправильная введенная операция");
                log.info("Неправильно введенная операция");
        }
        view.display(model.getResult());

    }

}