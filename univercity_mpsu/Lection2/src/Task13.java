import java.text.DecimalFormat;

public class Task13{
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        DecimalFormat df = new DecimalFormat("0.00");
        InputScanner scanner = new InputScanner();
        System.out.print("Input degrees Celsius = ");
        double celsius = scanner.getInputDouble();
        scanner.close();
        
        double fahrenheit = (celsius*9/5)+32;
        System.out.printf("Degrees Fahrenheit = %s", df.format(fahrenheit));
        
    }
}
