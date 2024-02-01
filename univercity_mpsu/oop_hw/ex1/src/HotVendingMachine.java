import java.util.LinkedList;
import java.util.List;

public class HotVendingMachine implements VendingMachine {
    private List<HotDrink> drinks = new LinkedList<>();

    public HotVendingMachine(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    public void setDrinks(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public void getDrink(Integer id, Integer volume, Integer temperature) {

        for (HotDrink drink : drinks) {
            if (drink.getId().equals(id)) {

                if (drink.getVolume().equals(volume)) {

                    if (drink.getTemperature().equals(temperature)) {
                        System.out.println("Возьмите ваш напиток " + drink);
                    }

                }

            }
        }

    }

}
