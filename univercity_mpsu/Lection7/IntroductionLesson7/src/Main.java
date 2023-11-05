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
                System.out.println("\nCreate polygon: ");
                Polygon f5 = new Polygon();
                System.out.println(f5.toString());
                break;
        }
        sc.close();
    }

    // private static double distanceBetweenPoint(Point2D p1, Point2D p2)
    // {
    //     return Math.sqrt(
    //             Math.pow((p1.getX() - p2.getX()), 2) +
    //                     Math.pow(p1.getY() - p2.getY(), 2));
    // }

    // public static double computeArea(Point2D p1, Point2D p2, Point2D p3)
    // {
    //     double sideA = distanceBetweenPoint(p1, p2);
    //     double sideB = distanceBetweenPoint(p2, p3);
    //     double sideC = distanceBetweenPoint(p3, p1);
    //     return computeArea(sideA, sideB, sideC);
    // }

    // public static double computeArea(Point2D p1, Point2D p2, Point2D p3, Point2D p4)
    // {
    //     double sideA = distanceBetweenPoint(p1, p2);
    //     double sideB = distanceBetweenPoint(p2, p3);
    //     double sideC = distanceBetweenPoint(p3, p4);
    //     double sideD = distanceBetweenPoint(p4, p1);
    //     return computeArea(sideA,sideB,sideC,sideD);
    // }

    // public static double computeArea(double sideA, double sideB, double sideC)
    // {
    //     double s = ((sideA) + (sideB) + (sideC))/2; 
    //     return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    // }

    // public static double computeArea(double sideA, double sideB, double sideC, double sideD)
    // {
    //     double s = (sideA + sideB + sideC + sideD) / 2;
    //     return Math.sqrt((s - sideA) * (s - sideB) * (s - sideC) * (s - sideD));
    // }

    // public static double computeArea(double side, double height, String type) throws Exception {
    //     if (type.equals("triangle"))
    //         return side * height/2;
    //     else if (type.equals("quadro"))
    //         return  side * height;
    //     else throw new Exception("Wrong type");
    // }

}
