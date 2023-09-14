import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int n = 79;
        // first method
        int result = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < 2; i++) {
            result += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(result);

        // second method
        int num1 = n /10; // take first
        int num2 = n % 10; // take last 
        System.out.println(num1+num2);
    }
}