package baseFold;

import java.util.Scanner;

public abstract class Figure {
    Scanner sc = new Scanner(System.in);
    protected double perimetr;
    protected double area;
    protected Point2D[] points;
    protected double[] sides;
    protected String type;

    protected void inputPoint2d()
    {
        for(int i = 0; i < points.length; i++) {
            Point2D obj = new Point2D();

            System.out.print("Input coord x: ");
            if (sc.hasNextDouble())
                obj.setX(sc.nextDouble());
            else
                obj.setX(0);

            System.out.print("Input coord y: ");
            if (sc.hasNextDouble())
                obj.setY(sc.nextDouble());
            else
                obj.setY(0);

            points[i] = obj;
        }
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Point2D[] getPoints() {
        return points;
    }

    public void setPoints(Point2D[] points) {
        this.points = points;
    }

    public double[] getSides() {
        return sides;
    }

    public void setSides(double[] sides) {
        this.sides = sides;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double computePerimetr()
    {
        double s = 0;
        for (double side:sides)
            s += side;
        return s;
    }

    public double computeArea()
    {
        if (type.toLowerCase().equals("triangle")) {
            double p = (sides[0] + sides[1] + sides[2]) / 2;
            return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
        } else if (type.toLowerCase().equals("mnogo")) {
            double area = 0;
            for (int i = 1; i <= points.length; i++)
                area += points[i-1].getX()*points[i%points.length].getY();
            for (int i = 1; i <= points.length; i++)
                area -= points[i%points.length].getX()*points[i-1].getY();
            return 0.5 * Math.abs(area);
        } else if (type.toLowerCase().equals("square")) {
            double side = sides[0]; // у квадрата все стороны равны
            return Math.pow(side, 2);
        }
        else return 0;
    }


}
