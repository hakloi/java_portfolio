public class Point3d {
    private double xCoord, yCoord, zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    // конструктор по умолчанию
    public Point3d () {
        this(0, 0, 0);
    }

    // оболочка доступа к нашим приватным переменным
    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getzCoord() {
        return zCoord;
    }

    public void setzCoord(double zCoord) {
        this.zCoord = zCoord;
    }

    @Override //переопределение метода 
    public String toString() {
        return "x = " + xCoord + 
                ", y = " + yCoord + 
                ", z = " + zCoord;
    }

    // radius vector sqrt(x^2 + y^2 + z^2)
    public boolean isSame(Point3d two) {
        System.out.println(this);
        System.out.println(two);
        // double term1 = Math.pow(this.xCoord, 2) + Math.pow(this.yCoord, 2) + Math.pow(this.zCoord, 2);
        // double radiusVector1 = Math.sqrt(term1);

        // double term2 = Math.pow(two.xCoord, 2) + Math.pow(two.yCoord, 2) + Math.pow(two.zCoord, 2);
        // double radiusVector2 = Math.sqrt(term2);

        // if (radiusVector1 == radiusVector2){
        //     System.out.printf("\nPoints' distance are the same! \n" + 
        //                         "Radius-vector = %.2f \n\n", radiusVector1);
        // } else if (radiusVector1 > radiusVector2){
        //     System.out.printf("\nFirst distance greater!\n" +
        //                         "Radius-vector 1 = %.2f\nRadius-vector 2 = %.2f \n\n", 
        //                          radiusVector1, radiusVector2);
        // } else  {
        //     System.out.printf("\nSecond distance greater!\n" +
        //                         "Radius-vector 1 = %.2f\nRadius-vector 2 = %.2f \n\n", 
        //                          radiusVector1, radiusVector2);
        // }
        boolean isSameXYZ = false;
        if (this.xCoord == two.xCoord && this.yCoord == two.yCoord &&
            this.zCoord == two.zCoord){
                System.out.println("These points the same!");
                return isSameXYZ = true;
            } else if (this.xCoord == two.xCoord && this.yCoord != two.yCoord &&
            this.zCoord != two.zCoord){
                System.out.println("X the same!");
                return isSameXYZ;
            } else if (this.xCoord != two.xCoord && this.yCoord == two.yCoord &&
            this.zCoord == two.zCoord){
                System.out.println("X and Z the same!");
                return isSameXYZ;
            } else if (this.xCoord == two.xCoord && this.yCoord == two.yCoord &&
            this.zCoord != two.zCoord){
                System.out.println("X and Y the same!");
                return isSameXYZ;
            } else if (this.xCoord != two.xCoord && this.yCoord != two.yCoord &&
            this.zCoord == two.zCoord){
                System.out.println("Z the same!");
                return isSameXYZ;
            } else if (this.xCoord != two.xCoord && this.yCoord == two.yCoord &&
            this.zCoord == two.zCoord){
                System.out.println("Y and Z the same!");
                return isSameXYZ;
            } else if (this.xCoord != two.xCoord && this.yCoord == two.yCoord &&
            this.zCoord != two.zCoord){
                System.out.println("Y the same!");
                return isSameXYZ;
            } else{
                System.out.println("These point are totally not the same!");
                return isSameXYZ;
            }
    }

    // sqrt ((x2-x1)^2 + (y2-y1)^2 + (z2-z1)^2 )
    public double distanceTo (Point3d two){

        double deltaX = Math.pow(Math.abs(this.xCoord - two.xCoord),2);
        double deltaY = Math.pow(Math.abs(this.yCoord - two.yCoord),2);
        double deltaZ = Math.pow(Math.abs(this.zCoord - two.zCoord),2);

        double result = Math.sqrt(deltaX+deltaY+deltaZ);
        return result;
    }

}
