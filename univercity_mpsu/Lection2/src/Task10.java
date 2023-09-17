public class Task10 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();

        System.out.print("Input number for factorail: ");
        int n = scanner.getInputInt();
        int result = 1;

        if (n == 0 || n == 1){ //base case
            System.out.printf("Factorial of %d equels 1", n);
        } else {
            for (int factor = 2; factor <= n; factor++) {
                result *= factor;
            }
            System.out.printf("Factorial of %d equels %d", n, result);
        }

        scanner.close();
    }
}