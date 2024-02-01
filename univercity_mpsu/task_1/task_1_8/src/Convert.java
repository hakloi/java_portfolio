import java.util.Arrays;

// JAVA
// Given a random non-negative number,
// you have to return the digits of this
// number within an array in reverse order.

public class Convert {
    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        int n = 12345;
        int size = countDig(n);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = n % 10;
            n = n / 10;
        }

        // array in order
        Arrays.sort(arr);

        // show result
        for (int i = 0; i < size; i++) {
            System.out.printf(arr[i] + " ");
        }

    }

    // method to find the number of digits present in the number n
    public static int countDig(int n) {
        int count = 0;
        while (n != 0) {
            // removing the last digit of the number n
            n = n / 10;
            // increasing count by 1
            count = count + 1;
        }
        return count;
    }
}
