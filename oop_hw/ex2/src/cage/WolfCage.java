package cage;

import animals.Animals;

public class WolfCage implements AnimalCage{
    int clean;
    private ArrayList<Integer> wolves;

    public WolfCage(){
        wolves = new ArrayList();
    }

    @Override
    public int addAnimal(Animals animals) {
        wolves.add(animals);
        return wolves.size();
    }

    @Override
    public int deliverFood(int foodWeight) {
        return 0;
    }

    @Override
    public int cleanCage() {
        clean = 0;
        return clean;
    }

    
    
}
