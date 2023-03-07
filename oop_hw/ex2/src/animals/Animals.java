package animals;
public abstract class Animals {
    private int age;
    private int weight;
    private int limbs;

    Animals(int age, int weight, int limbs){
        this.age = age;
        this.weight = weight;
        this.limbs = limbs;
    }

    public void feed(int foodWeight){
        if(this.weight + foodWeight <= getMaxWeight()) {
            this.weight =+ foodWeight;
        } else {
            System.out.println("Max weight exceeded!");
        }
    }

    public abstract int getMaxWeight();

    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getLimbs(){
        return limbs;
    }
    
    public void setLimbs(int limbs){
        this.limbs = limbs;
    }

    public abstract String getType();
    
}
