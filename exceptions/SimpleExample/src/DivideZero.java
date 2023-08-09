public class DivideZero {
    public static int Divide(int a1, int a2) {
        if (a2 == 0){
        throw new RuntimeException("Divide by zero not permitted");
        }
        return a1/a2;
    }
    
}
