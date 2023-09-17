public class Task7 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();

        // GREEDY ALGORITHM

        System.out.print("Input your number of subway rides: ");
        int num = scanner.getInputInt();

        scanner.close();
    }
}

