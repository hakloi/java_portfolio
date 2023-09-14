import java.util.Scanner;

public class Task3{
    
    public static void main(String[] args) {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter operation: +, -, *, /: ");
        char op = scanner.next().charAt(0);

        Task3 calculator = new Task3();
        System.out.println("Result: " + calculator.calculate(num1, num2, op));

        scanner.close();
    }

    public int calculate(int num1, int num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;

            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}
