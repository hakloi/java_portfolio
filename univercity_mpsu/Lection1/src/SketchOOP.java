import java.util.Scanner;

public class SketchOOP {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Welcome to Lection 1!\n" +
                        "Choose your task:\n" +
                        "   1. Hello World concatenation\n" + 
                        "   2. Hello World basic\n" + 
                        "   3. Calculator basic \n" + 
                        "   4. Calculator compound operations\n" +
                        "   5. Expression result\n" +
                        "   6. Expression: divide and conque\n" +
                        "   7. Sum of two nums in num\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Input an id: ");
        Integer idTask = in.nextInt();
        in.close();

        System.out.println();
        switch(idTask){

            case 1:
                String example = "Hello " + "World";
                System.out.println(example); 
                break;    

            case 2: 
                String hello = "Hello World!";
                System.out.println(hello);
                break;

            case 3: 
                // Task3 calculator = new Task3();


            case 4: 
            case 5: 
            case 6: 
            case 7: 
            default:
                System.out.println("Invalid input");
            }

        // 
    }
}
