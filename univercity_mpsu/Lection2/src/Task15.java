public class Task15 {
    public static void main(String[] args) throws Exception {
        // RETURN LATER

        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();
        System.out.println("The price");
        System.out.print("ROUBLE: ");
        int roublePrice = scanner.getInputInt();
        System.out.print("KOPECK: ");
        int kopeckPrice = scanner.getInputInt();

        System.out.println("Money are given");
        System.out.print("ROUBLE: ");
        int rouble = scanner.getInputInt();
        System.out.print("KOPECK: ");
        int kopeck = scanner.getInputInt();
        scanner.close();

        int deltaRouble = rouble - roublePrice;
        int deltaKopeck = kopeck - kopeckPrice;

        System.out.printf("Your Change: %d Rouble %d Kopeck", deltaRouble, deltaKopeck);

    

    }
}