import baseFold.Figure;
import baseFold.Point2D;


public class Square extends Figure {
    public Square() {
        perimetr = 0;
        area = 0;
        points = new Point2D[4];
        sides = new double[4];
        type = "square";

        boolean exitLoop = false;

        for (int i = 0; i < points.length; i++ ) {
            inputSquare();
            calcSides();
            if (checkSquare()) {
                exitLoop = true;
                break;
            } else {
                System.err.println("Wrong points! Can't build square, try again!");
            }
        }

        if (exitLoop) {
            // квадрат построен
            perimetr = computePerimetr();
            area = computeArea();
        } else {
            // квадрат не был построен
            System.err.println("Couldn't build a square with the given points!");
        }
    }

    private void inputSquare() { inputPoint2d(); }

    private void calcSides() {
        for (int i = 0; i < sides.length; i++)
            sides[i] = distanceBetweenPoint(points[i], points[(i + 1) % sides.length]);
    }

    private static double distanceBetweenPoint(Point2D p1, Point2D p2) {
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    private boolean checkSquare() {
        return (sides[0] == sides[1]) && (sides[1] == sides[2]) && (sides[2] == sides[3]);
    }

    @Override
    public String toString() {
        return "\nArea = " + area + "\nPerimeter = " + perimetr;
    }
}