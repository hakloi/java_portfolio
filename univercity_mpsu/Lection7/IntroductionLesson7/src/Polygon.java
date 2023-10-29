import baseFold.Figure;
import baseFold.Point2D;

public class Polygon extends Figure {
    public Polygon() {
        perimetr = 0;
        area = 0;
        int numPoints;

        do {
            System.out.print("Enter the number of points in the polygon: ");
            numPoints = inputInt();
        } while (numPoints < 3);

        points = new Point2D[numPoints];
        sides = new double[numPoints];
        type = "polygon";

        while (!checkPolygon()) {
            inputPolygon();
            calcSides();
            if (!checkPolygon())
                System.err.println("Wrong points! Can't build polygon, try again!");
        }
        perimetr = computePerimetr();
        area = computeArea();
    }

    private void inputPolygon() {
        for (int i = 0; i < points.length; i++) {
            System.out.println("Enter coordinates of point " + (i + 1) + ":");
            double x = inputDouble("Enter x: ");
            double y = inputDouble("Enter y: ");
            points[i] = new Point2D(x, y);
        }
    }

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
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] <= 0)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Polygon:\n");
        stringBuilder.append("Perimeter: ").append(perimetr).append("\n");
        stringBuilder.append("Area: ").append(area).append("\n");
        stringBuilder.append("Sides: ");
        for (double side : sides) {
            stringBuilder.append(side).append(", ");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}