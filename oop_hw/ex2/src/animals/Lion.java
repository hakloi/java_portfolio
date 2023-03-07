package animals;
public class Lion extends Animals {
    protected int maneVolume;

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";


    public Lion(int age, int weight, int limbs, int maneVolume){
        super(age, weight, limbs);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume(){
        return maneVolume;
    }

    public void setManeVolume(int maneVolume){
        this.maneVolume = maneVolume;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }
    
}
