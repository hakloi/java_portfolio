import java.text.DecimalFormat;

public class Task2 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        DecimalFormat df = new DecimalFormat("0.00");
        InputScanner scanner = new InputScanner();

        System.out.print("Input your amount of dollars: ");
        double num = scanner.getInputDouble();

        System.out.println("\nChoose the number: \n" +
                            "   1. Convert to Pounds;\n" +
                            "   2. Convert to Deutsche Mark;\n" +
                            "   3. Convert to Yen;\n" +
                            "   4. Convert to Frank;\n");

        System.out.print("Input id: ");
        int id = scanner.getInputInt();
        switch (id){
            case 1:
                double pounds = num / 1.487; 
                System.out.printf("\nDollars: %f;\nPounds: %s\n", num, df.format(pounds));
                break;
            case 2:
                double marks = num / 0.584; 
                System.out.printf("\nDollars: %f;\nDeutsche Mark: %s\n", num, df.format(marks));
                break;
            case 3:
                double yen = num / 0.00955; 
                System.out.printf("\nDollars: %f;\nYen: %s\n", num, df.format(yen));
                break;
            case 4:
                double franks = num / 0.172; 
                System.out.printf("\nDollars: %f;\nFranks: %s\n", num, df.format(franks));
                break;
            default:
                System.out.println("Invalid input");
        }
        scanner.close();



    }
}