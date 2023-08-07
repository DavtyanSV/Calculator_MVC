import java.util.Scanner;
/**
 * В данном классе соблюдается принцип SRP
 * Все методы касаются работы с пользователем, а именно предоставлением ему информации
 * и принятием информации от пользователя
 */
public class CalculatorView {

    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    // Метод вывода результата
    public void display(double result) {
        System.out.println("Полученный результат = " + result);
    }

    // Метод ввода операции
    public String getOperation() {
        System.out.println("Введите операцию: +, -, *, /");
        return scanner.nextLine();
    }

    // метод ввода числа 
    public double getOperand() {
        System.out.println("Введите число -> ");
        return Double.parseDouble(scanner.nextLine());
    }

    

}
