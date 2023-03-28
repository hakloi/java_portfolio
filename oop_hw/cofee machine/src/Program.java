import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        VendingMachine machine = new VendingMachine();
        machine.addHotDrink(new HotDrink(1, "Cappucino", 200, 100, 70));
        machine.addHotDrink(new HotDrink(2, "Latte", 200, 100, 70));
        machine.addHotDrink(new HotDrink(3, "Espresso", 30, 60, 90));
        machine.addHotDrink(new HotDrink(4, "Mocachino", 200, 120, 70));
        
        System.out.print("Welcome to our Coffee Shop!\n" +
                        "Choose drink and write name!\n" +
                        "   > Cappucino - 100 RUB\n" + 
                        "   > Latte - 100 RUB\n" + 
                        "   > Espresso - 60 RUB\n" + 
                        "   > Mocachino - 120 RUB\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a name: ");
        String coffee = in.nextLine();
        in.close();
        ArrayList list = machine.getHotDrinkByName(coffee);
        System.out.println(list);

    }


}
