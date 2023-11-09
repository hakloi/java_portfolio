import baseFold.Figure;
import baseFold.Point2D;


public class Rhomb extends Figure {
    public Rhomb() {
        perimetr = 0;
        area = 0;
        points = new Point2D[4];
        sides = new double[4];
        type = "rhomb";
        boolean exitLoop = false;

        for (int i = 0; i < points.length; i++ ) {
            inputRhomb();
            calcSides();
            if (checkRhomb()) {
                exitLoop = true;
                break;
            } else {
                System.err.println("Wrong points! Can't build rhomb, try again!");
            }
        }

        if (exitLoop) {
            perimetr = computePerimetr();
            area = computeArea();
        } else {

            System.err.println("Couldn't build a rhomb with the given points!");
        }
    }

    private void inputRhomb() { inputPoint2d(); }

    private void calcSides() {
        for (int i = 0; i < sides.length; i++)
            sides[i] = distanceBetweenPoint(points[i], points[(i + 1) % sides.length]);
    }

    @Override
    public double computeArea() {
        double diagonal1 = distanceBetweenPoint(points[0], points[2]);
        double diagonal2 = distanceBetweenPoint(points[1], points[3]);
        System.out.printf("\nDiagonal 1: %f; \nDiagonal 2: %f;", diagonal1, diagonal2);
        return (diagonal1*diagonal2)/2;
    }
    

    private static double distanceBetweenPoint(Point2D p1, Point2D p2) {
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    private boolean checkRhomb() {
        boolean allSidesEqual = true;
        boolean diagonalsPerpendicular = true;
        boolean equalDiagonals = false;

        // equal sides
        for (int i = 0; i < sides.length - 1; i++) {
            if (sides[i] != sides[i + 1]) {
                allSidesEqual = false;
                break;
            }
        }
        // check 1st and 4th sides for option
        if (sides[0] != sides[sides.length - 1]) {
            allSidesEqual = false;
        }

        // perpendicular diagonals
        // k1 * k2 = -1
        // k = tga = bc/ac = y2-y1/x2-x1
        double angularСoeff1 = (points[1].getY() - points[0].getY()) / (points[1].getX() - points[0].getX());
        System.out.println(angularСoeff1);
        double angularСoeff2 = (points[2].getY() - points[1].getY()) / (points[2].getX() - points[1].getX());
        System.out.println(angularСoeff2);
        if (angularСoeff1 * angularСoeff2 != -1.0) {
            diagonalsPerpendicular = false;
        }

        double d1 = distanceBetweenPoint(points[0], points[2]);
        double d2 = distanceBetweenPoint(points[1], points[3]);
        if (Double.compare(d1, d2) != 0) {
            equalDiagonals = true;
        }
        

        return allSidesEqual && diagonalsPerpendicular || equalDiagonals; 
    }

    @Override
    public String toString() {
        return "\nArea = " + area + "\nPerimeter = " + perimetr;
    }
}
