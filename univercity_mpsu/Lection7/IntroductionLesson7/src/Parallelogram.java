import baseFold.Figure;
import baseFold.Point2D;

public class Parallelogram extends Figure {
    public Parallelogram() {
        perimetr = 0;
        area = 0;
        points = new Point2D[4];
        sides = new double[4];
        type = "parallelogram";

        boolean exitLoop = false;

        for (int i = 0; i < points.length; i++ ) {
            inputParallelogram();
            calcSides();
            if (checkParallelogram()) {
                exitLoop = true;
                break;
            } else {
                System.err.println("Wrong points! Can't build parallelogram, try again!");
            }
        }

        if (exitLoop) {
            perimetr = computePerimetr();
            area = computeArea();
        } else {

            System.err.println("Couldn't build a parallelogram with the given points!");
        }
    }

    @Override
    public double computeArea() {
        // S= a*h
        double base = distanceBetweenPoint(points[0], points[1]); 
        double height = distanceBetweenPoint(points[3], points[2]); // h
    
        return base * height; 
    }

    @Override
    public double computePerimetr()
    {
        double s1 = distanceBetweenPoint(points[0], points[1]);
        double s2 = distanceBetweenPoint(points[1], points[2]);
        return 2*(s1 +s2);
    }


    private void inputParallelogram() { inputPoint2d(); }

    private void calcSides() {
        for (int i = 0; i < sides.length; i++)
            sides[i] = distanceBetweenPoint(points[i], points[(i + 1) % sides.length]);
    }

    private static double distanceBetweenPoint(Point2D p1, Point2D p2) {
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    private boolean checkParallelogram() {
        boolean oppositeSidesEqual = true;
        boolean parallelOppositeSides = true;
        //The compare() method of Double Class i- compares the two double values
        if (Double.compare(sides[0], sides[2]) != 0 && Double.compare(sides[1], sides[3]) != 0) {
            oppositeSidesEqual = false;
        }

        double angularСoeff1 = (points[1].getY() - points[0].getY()) / (points[1].getX() - points[0].getX());
        System.out.println(angularСoeff1);
        double angularСoeff2 = (points[3].getY() - points[2].getY()) / (points[3].getX() - points[2].getX());
        System.out.println(angularСoeff2);

        if (angularСoeff1 != angularСoeff2) {
            parallelOppositeSides = false;
        }

        return oppositeSidesEqual && parallelOppositeSides;
    }

    @Override
    public String toString() {
        return "\nArea = " + area + "\nPerimeter = " + computePerimetr();
    }
}
