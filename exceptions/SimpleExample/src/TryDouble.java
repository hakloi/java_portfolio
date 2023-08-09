public class TryDouble {
    public static boolean DivideArrays() {
        int arr1[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int arr2[] = {2, 0, 4, 4, 0, 8};
        System.out.println("\nSTART");
        try{
            for (int i = 0; i < arr1.length; i++){
                try{
                    System.out.println(arr1[i] + " / " + arr2[i] +
                                        " = " + arr1[i]/arr2[i]);
                } catch (ArithmeticException exc) {
                    System.out.println("Division by zero");
                }
            }
        } catch (ArrayIndexOutOfBoundsException param){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Fatality Error");
        }
        return true;
    }
}
