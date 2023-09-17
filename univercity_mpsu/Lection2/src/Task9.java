public class Task9 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();

        System.out.println("ax + b = 0");
        System.out.print("Input a: ");
        int a = scanner.getInputInt();
        System.out.print("Input b: ");
        int b = scanner.getInputInt();
        
        if (a == 0 && b == 0){
            System.out.println("INF");
        } else if (a == 0 || (b % a) != 0) {
            System.out.println("NO");
        } else {
            System.out.println(-b / a);
        }
        

        scanner.close();
    }
}