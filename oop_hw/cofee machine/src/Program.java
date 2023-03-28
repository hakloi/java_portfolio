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
        machine.addHotDrink(new HotDrink(1, "Cappucino", 300, 100, 70));
        machine.addHotDrink(new HotDrink(1, "Cappucino", 200, 100, 80));
        machine.addHotDrink(new HotDrink(1, "Cappucino", 300, 100, 80));

        machine.addHotDrink(new HotDrink(2, "Latte", 200, 100, 70));
        machine.addHotDrink(new HotDrink(2, "Latte", 300, 100, 70));
        machine.addHotDrink(new HotDrink(2, "Latte", 200, 100, 80));
        machine.addHotDrink(new HotDrink(2, "Latte", 300, 100, 80));

        machine.addHotDrink(new HotDrink(3, "Espresso", 30, 60, 90));
        machine.addHotDrink(new HotDrink(3, "Espresso", 60, 60, 90));
        machine.addHotDrink(new HotDrink(3, "Espresso", 30, 60, 80));
        machine.addHotDrink(new HotDrink(3, "Espresso", 60, 60, 80));

        machine.addHotDrink(new HotDrink(4, "Mocachino", 200, 120, 70));
        machine.addHotDrink(new HotDrink(4, "Mocachino", 300, 120, 70));
        machine.addHotDrink(new HotDrink(4, "Mocachino", 200, 120, 60));
        machine.addHotDrink(new HotDrink(4, "Mocachino", 300, 120, 60));
        
        System.out.print("Welcome to our Coffee Shop!\n" +
                        "Choose drink and write id!\n" +
                        "   1. Cappucino - 200, 300 ml - 70, 80C\n" + 
                        "   2. Latte - 200, 300 ml - 70, 80C\n" + 
                        "   3. Espresso - 30, 60 ml - 80, 90C \n" + 
                        "   4. Mocachino - 200, 300 ml - 60, 70C\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Input an id: ");
        Integer idCoffee = in.nextInt();

        System.out.print("Input a volume: ");
        Integer volumeCoffee = in.nextInt();

        System.out.print("Input a temprature: ");
        Integer tempCoffee = in.nextInt();
        in.close();


        ArrayList list = machine.getHotDrinkByName(idCoffee, volumeCoffee, tempCoffee);
        System.out.println(list);

    }


}
