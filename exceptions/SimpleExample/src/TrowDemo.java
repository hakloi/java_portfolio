public class TrowDemo{
    public static void Exc(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Set - " + what);
        try{
            switch (what) {
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        }
        catch (ArithmeticException exc){
            System.out.println("Division by 0");
            return;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("finally");
        }
    }
}