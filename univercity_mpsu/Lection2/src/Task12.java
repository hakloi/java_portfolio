public class Task12{
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();
        System.out.print("Input number: ");
        int n = scanner.getInputInt();
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
    }
    System.out.println(sum + " ");
}
}