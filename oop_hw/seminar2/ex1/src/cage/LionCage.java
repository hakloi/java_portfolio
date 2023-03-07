package cage;

import java.util.ArrayList;

import animals.Animals;

public class LionCage implements AnimalCage{
    int clean;
    private ArrayList lions;

    public LionCage(){
        lions = new ArrayList();
    }

    @Override
    public int addAnimal(Animals animals) {
        lions.add(animals);
        return lions.size();
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
