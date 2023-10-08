public class User {
    public static void main (String[] args) {
        // clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //code begins

        // Point2d firstP = new Point2d(0, 0);
        // Point2d secondP = new Point2d(5, 1);
        // System.out.println(firstP);
        // System.out.println(secondP);
        
        Point3d p3 = new Point3d(9, 3, 8);
        Point3d p4 = new Point3d(8, 9, 8);

        p3.isSame(p4);
        System.out.printf("\nThe distanse between these point = %.2f",p3.distanceTo(p4));
    }
}
