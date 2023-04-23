import java.util.Scanner;

public class App {

    static Model model;
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
                            "Choose your next step:" );
        int answer = scanner.nextInt();
        switch (answer) {
            case 1:
                buttonClick();
            case 2:
                System.out.println("Okay, I will wait for you! Bye! :)");
                break;
            default:
                System.out.println("Sorry, wrong number...try again!");
            }
        scanner.close();
    }

    public static void buttonClick(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nChoose operation:" +
                        "\n   1. Sum" + "\n   2. Diff" +
                        "\n   3. Div" + "\n   4. Mult" +
                        "\n   5. Extent\n");
        int number = in.nextInt();
        System.out.print("\nNow write numbers!");
        System.out.print("\nX: ");
        double a = in.nextDouble();
        System.out.print("Y: ");
        double b = in.nextDouble();
        model.setX(a);
        model.setY(b);
        switch (number){
            case 1:
                Operation.sum();
            // case 2:
            //     Operation.diff(a, b);
            // case 3:
            //     Operation.div(a, b);
            // case 4:
            //     Operation.mult(a, b);
            // case 5: 
            //     Operation.extent(a, b);
            default:
                System.out.println("Sorry, wrong number...try again!");
        }
        in.close();
        

    }
}
