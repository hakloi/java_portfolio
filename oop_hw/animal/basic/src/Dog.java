public class Dog extends BasicAnimal {
    private String breed;
    private int age;
    private float weight;

    public Dog(String breed, int age, float weight){
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nDOG" +
                // "\n1) Name: " + name +
                "\n2) Breed: " + breed + 
                "\n3) Age: " + age +
                "\n4) Weight: " + weight;
    }
}
