package animals;

public class Wolf extends Animals{

    protected static final int MAX_WEIGHT = 70;
    protected static final String TYPE = "Wolf";

    Wolf(int age, int weight, int limbs) {
        super(age, weight, limbs);
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }
    
}
