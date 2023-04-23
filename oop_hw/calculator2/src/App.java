import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("\nHello, " + name+ "! Want to try this app?\n" +
                            "   1. YES! OF COURSE! \n" + "   2. No, thanks\n" +
                            "Choose number... So?" );
        String answer = scanner.nextLine();
        switch (answer) {
            case "1":
                System.out.println("I promise you will not regret it!");
                break;
            case "2":
                System.out.println("Okay, I will wait for you! Bye! :)");
                break;
            default:
                System.out.println("Sorry, wrong number...try again!");
            }
        scanner.close();
    }
}
