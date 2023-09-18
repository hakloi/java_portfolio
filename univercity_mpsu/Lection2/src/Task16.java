public class Task16 {
    public static void main(String[] args) throws Exception {
        // RETURN LATER

        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();
        System.out.println("We can give you 3 or 5 scoops");
        System.out.println("How much scoops of ice cream?");
        int n = scanner.getInputInt();

        if (n % 3 == 0 || n % 5 == 0){
            System.out.println("That's your ice cream, kid!");
        } else {System.out.println("Sorry, we cant give you it...");}
    }
}