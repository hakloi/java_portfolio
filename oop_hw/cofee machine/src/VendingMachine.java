import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<HotDrink> list;

    public void addHotDrink(HotDrink newItem){
        list.add(newItem);
    }

    public VendingMachine(){
        list = new ArrayList<HotDrink>();
    }

    public ArrayList getHotDrinkByName(String searchName){
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        for(HotDrink Item : list){
            if(Item.getName().contains(searchName)){
                result.add(Item);
            }
        }
        return result;
    }

    public ArrayList getHotDrinkByCost(String searchPriece){
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        for(HotDrink Item : list){
            if(Item.getName().equals(searchPriece)){
                result.add(Item);
            }
        }
        return result;
    }
}
