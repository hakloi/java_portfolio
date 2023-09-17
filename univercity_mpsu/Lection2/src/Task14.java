public class Task14{
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        InputScanner scanner = new InputScanner();
        System.out.print("Input your year: ");
        int year = scanner.getInputInt();
        scanner.close();

        if ((year % 4 == 0) &&
            (year % 100 != 0) ||
            (year % 400 == 0)){
                System.out.println("It's leap year!");
        } else { System.out.println("It's ordinary year...");}
    }
}
