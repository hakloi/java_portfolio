import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int index;
    public static void main(String[] args) throws Exception{
        // clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Welcome!\nWhat type of figure do you want to create?");
        System.out.println("\n\t1. Triangle" + "\n\t2. Square" + "\n\t3. Rhomb" +
                            "\n\t4. Parallelogram" + "\n\t5. Polygon");
        Scanner sc = new Scanner(System.in);
        try {
            index = sc.nextInt();
            if (index < 1 || index > 5) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) { 
            System.out.println("Invalid index! Please enter a value between 1 and 5.");
        }

        switch (index) {
            case 1:
                System.out.println("\nCreate triangle: ");
                Triangle f1 = new Triangle();
                System.out.println(f1.toString());
                break;
            case 2: 
                // (1 1) (1 3) (3 3) (3 1) work
                System.out.println("\nCreate square: ");
                Square f2 = new Square();
                System.out.println(f2.toString());
                break;
            case 3: 
                // // (1 2) (2 3) (3 2) (2 1) work
                System.out.println("\nCreate rhomb: ");
                Rhomb f3 = new Rhomb();
                System.out.println(f3.toString());
                break;
            case 4: 
                // (1 1) (2 3) (5 3) (4 1) work
                System.out.println("\nCreate parallelogram: ");
                Parallelogram f4 = new Parallelogram();
                System.out.println(f4.toString());
                break;
            case 5: 
                // 8 , 3 0 , 2 1, 2 2, 3 3, 4 3, 5 2, 5 1, 5 0 
                System.out.println("\nCreate regular polygon: ");
                Polygon f5 = new Polygon();
                System.out.println(f5.toString());
                break;
        }
        sc.close();
    }
}
