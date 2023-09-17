public class Task8 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();
        System.out.print("Input number to define sigh: ");
        int n = scanner.getInputInt();
        scanner.close();
        if (n > 0){
            System.out.printf("Sign(%d) = 1", n);
        } else if (n == 0){
            System.out.printf("Sign(%d) = 0",n);
        } else{System.out.printf("Sign(%d) = -1",n);}
        
    }
}
