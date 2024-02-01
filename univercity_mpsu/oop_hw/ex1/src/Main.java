// Создать наследника реализованного класса HotDrink
// с дополнительным полем int температура
// Создать класс HotDrinkVendingMachine наследника
// VendingMachine и реализовать перегруженный метод
// getProduct(String name, double volume, double temperature),
// выдающий продукт соответствующего имени, объема и температуры.
// Используйте при итерации конструкцию
// if (product instance of HotDrink){ HotDrink ht = (HotDrink) product; }
// В main проинициализировать несколько экземпляров HotDrink и
// один HotDrinkVendingMachine и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins

        List<HotDrink> drinks = new LinkedList<>(List.of(new HotDrink(1, "Coffee", 100, 70),
                new HotDrink(1, "Coffee", 100, 80),
                new HotDrink(1, "Coffee", 100, 90),
                new HotDrink(1, "Coffee", 200, 70),
                new HotDrink(1, "Coffee", 200, 80),
                new HotDrink(1, "Coffee", 200, 90),
                new HotDrink(1, "Coffee", 400, 70),
                new HotDrink(1, "Coffee", 400, 80),
                new HotDrink(1, "Coffee", 400, 90),
                new HotDrink(2, "Cappuccino", 100, 70),
                new HotDrink(2, "Cappuccino", 100, 80),
                new HotDrink(2, "Cappuccino", 100, 90),
                new HotDrink(2, "Cappuccino", 200, 70),
                new HotDrink(2, "Cappuccino", 200, 80),
                new HotDrink(2, "Cappuccino", 200, 90),
                new HotDrink(2, "Cappuccino", 400, 70),
                new HotDrink(2, "Cappuccino", 400, 80),
                new HotDrink(2, "Cappuccino", 400, 90)));
        HotVendingMachine machine = new HotVendingMachine(drinks);

        machine.getDrink(getId(), getVolume(), getTemperature());

    }

    public static Integer getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер напитка: ");
        Integer drinkId = scanner.nextInt();

        return drinkId;

    }

    public static Integer getVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите обьем напитка(100мл, 200мл, 400мл): ");
        Integer drinkVolume = scanner.nextInt();

        return drinkVolume;
    }

    public static Integer getTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру напитка(70°, 80°, 90°): ");
        Integer drintemperature = scanner.nextInt();

        return drintemperature;
    }
}