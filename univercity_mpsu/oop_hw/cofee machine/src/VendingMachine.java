import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<HotDrink> list;

    public void addHotDrink(HotDrink newItem){
        list.add(newItem);
    }

    public VendingMachine(){
        list = new ArrayList<HotDrink>();
    }

    public ArrayList getHotDrink(Integer id, Integer volume, Integer temperature){
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        boolean have = false;
        for(HotDrink Item : list){
            if(Item.getId().equals(id)){
                if (Item.getVolume().equals(volume)) {
                    if (Item.getTemperature().equals(temperature)) {
                        result.add(Item);
                        have = true;
                    }
                }
            } 
        }
        if (have == true){
            System.out.print("Take your coffee! Have a good day!\n");
        } else {
            System.out.print("Sorry, we don't have this coffee. Try again!\n");
        }
        return result;
    }
}
