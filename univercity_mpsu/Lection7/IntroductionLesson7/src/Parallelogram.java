import baseFold.Figure;
import baseFold.Point2D;

public class Parallelogram extends Figure {
    public Parallelogram() {
        perimetr = 0;
        area = 0;
        points = new Point2D[4];
        sides = new double[4];
        type = "parallelogram";

        while (!checkParallelogram()) {
            inputParallelogram();
            calcSides();
            if (!checkParallelogram())
                System.err.println("Wrong points! Can't build parallelogram, try again!");
        }
        perimetr = computePerimetr();
        area = computeArea();
    }

    private void inputParallelogram() { inputPoint2d(); }

    private void calcSides() {
        for (int i = 0; i < sides.length; i++)
            sides[i] = distanceBetweenPoint(points[i], points[(i + 1) % sides.length]);
    }

    private boolean checkParallelogram() {
        return (sides[0] == sides[2]) && (sides[1] == sides[3]) && (sides[0] != sides[1]);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parallelogram:\n");
        stringBuilder.append("Perimeter: ").append(perimetr).append("\n");
        stringBuilder.append("Area: ").append(area).append("\n");
        stringBuilder.append("Sides: ").append(sides[0]).append(", ").append(sides[1]).append(", ").append(sides[2]).append(", ").append(sides[3]).append("\n");
        return stringBuilder.toString();
    }
}
