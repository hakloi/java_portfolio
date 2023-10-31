import baseFold.Figure;
import baseFold.Point2D;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        // clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Figure[] figures = new Figure[4];
        System.out.println("Triangle: ");
        figures[0] = new Triangle();
        System.out.println("Square: ");
        figures[1] = new Square();
        System.out.println("Rhomb: ");
        figures[2] = new Rhomb();
        System.out.println("Parallelogram: ");
        figures[3] = new Parallelogram();
        System.out.println("Polygon: ");
        figures[4] = new Polygon();

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }

    }

    private static double distanceBetweenPoint(Point2D p1, Point2D p2)
    {
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    public static double computeArea(Point2D p1, Point2D p2, Point2D p3)
    {
        double sideA = distanceBetweenPoint(p1, p2);
        double sideB = distanceBetweenPoint(p2, p3);
        double sideC = distanceBetweenPoint(p3, p1);
        return computeArea(sideA, sideB, sideC);
    }

    public static double computeArea(Point2D p1, Point2D p2, Point2D p3, Point2D p4)
    {
        double sideA = distanceBetweenPoint(p1, p2);
        double sideB = distanceBetweenPoint(p2, p3);
        double sideC = distanceBetweenPoint(p3, p4);
        double sideD = distanceBetweenPoint(p4, p1);
        return computeArea(sideA,sideB,sideC,sideD);
    }

    public static double computeArea(double sideA, double sideB, double sideC)
    {
        double s = ((sideA) + (sideB) + (sideC))/2; 
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public static double computeArea(double sideA, double sideB, double sideC, double sideD)
    {
        double s = (sideA + sideB + sideC + sideD) / 2;
        return Math.sqrt((s - sideA) * (s - sideB) * (s - sideC) * (s - sideD));
    }

    public static double computeArea(double side, double height, String type) throws Exception {
        if (type.equals("triangle"))
            return side * height/2;
        else if (type.equals("quadro"))
            return  side * height;
        else throw new Exception("Wrong type");
    }

}
