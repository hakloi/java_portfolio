import java.io.IOException;

public class Lab1 {
    public static void main(String[] args) throws IOException {
        // clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Point1: (x, y, z)");
        InputScanner scanner = new InputScanner();

        System.out.print("Please enter x1: ");
        double x1 = scanner.getInputDouble();
        System.out.print("Please enter y1: ");
        double y1 = scanner.getInputDouble();
        System.out.print("Please enter z1: ");
        double z1 = scanner.getInputDouble();

        System.out.println("Point2: (x, y, z)");
        
        System.out.print("Please enter x2: ");
        double x2 = scanner.getInputDouble();
        System.out.print("Please enter y2: ");
        double y2 = scanner.getInputDouble();
        System.out.print("Please enter z2: ");
        double z2 = scanner.getInputDouble();

        System.out.println("Point3: (x, y, z)");
        
        System.out.print("Please enter x3: ");
        double x3 = scanner.getInputDouble();
        System.out.print("Please enter y3: ");
        double y3 = scanner.getInputDouble();
        System.out.print("Please enter z3: ");
        double z3 = scanner.getInputDouble();

        scanner.close();

        Point3d n1 = new Point3d(x1, y1, z1);
        Point3d n2 = new Point3d(x2, y2, z2);
        Point3d n3 = new Point3d(x3, y3, z3);
        
        System.out.printf("The area of the triangle: %.2f ", computeArea(n1, n2, n3));
    }

    // S = sqrt (p(p-a)(p-b)(p-c))
    /* https://ru.onlinemschool.com/math/assistance/vector/triangle_area/
    
     * CHECKED!!!!!!!!
     */
     public static double computeArea(Point3d n1, Point3d n2, Point3d n3){
        double a = n1.distanceTo(n2);
        double b = n2.distanceTo(n3);
        double c = n3.distanceTo(n1);
        double p = (a+b+c)/2;

        double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return result;
     }
}
