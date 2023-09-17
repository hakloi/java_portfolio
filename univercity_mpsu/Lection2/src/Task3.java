public class Task3 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();
        System.out.print("Input a: ");
        int a = scanner.getInputInt();
        System.out.print("Input b: ");
        int b = scanner.getInputInt();

        if (a == b){
            System.out.printf("a = %d equels b = %d", a, b);
        } else if(a > b){
            System.out.printf("a = %d greater than b = %d", a,b );
        } else {
            System.out.printf("b = %d greater than a = %d", b, a);
        }
    }
}
