public class Task5 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();

        System.out.print("Input your number: ");
        int num = scanner.getInputInt();
        System.out.printf("Is %d EVEN number?\n", num);
        if (num % 2 == 0){
            System.out.println("YES");
        } else {System.out.println("NO");}
    }
}
