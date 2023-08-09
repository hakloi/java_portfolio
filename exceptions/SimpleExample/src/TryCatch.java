public class TryCatch {
    public static final char[] TryCatchException = null;

    public static boolean TryCatchException() {
        int[] nums = new int[4];

        try{
            System.out.println("Test1");

            nums[7] = 10;
            System.out.println("Test2");
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Test3");
        }
        System.out.println("Test4");
        return true;
    }
}
