import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);

        int num = 12;
        System.out.printf("Your number is %d", num);
        System.out.print("\nEnter operation: +, -, *, /: ");
        char op = scanner.next().charAt(0);

        scanner.close();

        switch(op){
            case '+': 
                System.out.println(++num);
                break;
            case '-': 
                System.out.println(--num);
                break;
            case '*':
                System.out.println(num *= num);
                break;
            case '/':
                System.out.println(num /= num);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}