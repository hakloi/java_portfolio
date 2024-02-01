package cage;

import animals.Animals;

public interface AnimalCage {
    int addAnimal(Animals animals);
    int deliverFood(int foodWeight);
    int cleanCage();
}
