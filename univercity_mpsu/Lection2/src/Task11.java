public class Task11{
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

        for (int i = a; i <= b; i++){
            if (i % 2 == 0){
                System.out.printf("%d ", i);
            } 
        }
    }
}