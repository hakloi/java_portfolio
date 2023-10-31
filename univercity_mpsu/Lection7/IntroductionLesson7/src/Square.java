import baseFold.Figure;
import baseFold.Point2D;


public class Square extends Figure {
    public Square() {
        perimetr = 0;
        area = 0;
        points = new Point2D[4];
        sides = new double[4];
        type = "square";

        while (!checkSquare()) {
            inputSquare();
            calcSides();
            if (!checkSquare())
                System.err.println("Wrong points! Can't build square, try again!");
        }
        perimetr = computePerimetr();
        area = computeArea();
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Square:\n");
        stringBuilder.append("Perimeter: ").append(perimetr).append("\n");
        stringBuilder.append("Area: ").append(area).append("\n");
        stringBuilder.append("Sides: ").append(sides[0]).append(", ").append(sides[1]).append(", ").append(sides[2]).append(", ").append(sides[3]).append("\n");
        return stringBuilder.toString();
    }
}