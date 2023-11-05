import java.util.InputMismatchException;
import java.util.Scanner;

import baseFold.Figure;
import baseFold.Point2D;

public class Polygon extends Figure {
    private int numPoints;
    private double[] angles;

    public Polygon() {
        perimetr = 0;
        area = 0;
        int numPoints = 1;
        boolean exitLoop = false;

        System.out.print("Enter the number of points in the polygon: ");
        Scanner sc = new Scanner(System.in);
        try {
            numPoints = sc.nextInt();
        } catch (InputMismatchException ex) { // вводимое значение не соответствует о типу данных
            System.out.println("It is not a number!");
        }
        sc.close();

        if (numPoints > 3) {
            points = new Point2D[numPoints];
            sides = new double[numPoints];
            type = "polygon";
                
            for (int i = 0; i < points.length; i++ ) {
                inputPolygon();
                calcSides();
                if (checkPolygon()) {
                    exitLoop = true;
                    break;
                } else {
                    System.err.println("Wrong points! Can't build regular polygon, try again!");
                }
            }

            if (exitLoop) {
                perimetr = computePerimetr();
                area = computeArea();
            } else {

                System.err.println("Couldn't build a regular polygon with the given points!");
            }
        } else {
            System.out.println("Sorry, are you sure you want a polygon?");
            if (numPoints < 3){ System.out.printf("\nThere are not figure with %d coords", numPoints);}
            else if(numPoints == 3){System.out.println("\nIt seems like you want triangle. Use appropriate function!");}
        }




    }



    // @Override
    // public double computeArea() {
        
    // }

    // @Override
    // public double computePerimetr()
    // {

    // }

    // private void calcAngles() {
    //     for (int i = 0; i < numPoints; i++) {
    //         double side1 = sides[i];
    //         double side2 = sides[(i + 1) % numPoints]; // индекс следующей стороны в круговом порядке
    //         double side3 = sides[(i + 2) % numPoints]; // индекс стороны после следующей стороны
    
    //         // Вычисление угла между сторонами с помощью закона косинусов
    //         double angle = Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2));
    //         angle = Math.toDegrees(angle);
    
    //         angles[i] = angle;
    //     }
    // }


    private void inputPolygon() { inputPoint2d(); }

    private void calcSides() {
        for (int i = 0; i < sides.length; i++)
            sides[i] = distanceBetweenPoint(points[i], points[(i + 1) % sides.length]);
    }

    private static double distanceBetweenPoint(Point2D p1, Point2D p2) {
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    private boolean checkPolygon() {
        boolean allSidesEqual = true;
        boolean allAnglesEqual = true;

        // equal sides
        for (int i = 0; i < sides.length - 1; i++) {
            if (sides[i] != sides[i + 1]) {
                allSidesEqual = false;
                break;
            }
        }
        // equal angles 

        return allSidesEqual && allAnglesEqual;
    }

    @Override
    public String toString() {
        return "\nArea = " + area + "\nPerimeter = " + perimetr;
    }
}