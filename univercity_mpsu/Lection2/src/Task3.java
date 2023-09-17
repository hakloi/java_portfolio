import java.text.DecimalFormat;

public class Task3 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        DecimalFormat df = new DecimalFormat("0.00");
        InputScanner scanner = new InputScanner();

        System.out.print("Input your start-up money: ");
        double money = scanner.getInputDouble();

        System.out.print("Input the years: ");
        int years = scanner.getInputInt();

        System.out.print("Input your interest rate: ");
        double rate = scanner.getInputDouble();
        double result = money;
        int num = 1;
        while (num <= years){
            double term = (result*(rate/100)); //(3000*(5,5/100)) = 165
            result = money + term ; // 3000+ 165 = result (changed)
            money += term; //3000 +165 = money (changed)
            ++num;
        }
        System.out.println(df.format(money));

    }
}
