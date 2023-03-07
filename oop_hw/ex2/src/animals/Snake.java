package animals;
public class Snake extends Animals{
    private int bodyLenght;

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Snake";

    public Snake(int age, int weight, int limbs, int bodyLenght){
        super(age, weight, limbs);
        this.bodyLenght = bodyLenght;
    }

    public int getManeVolume(){
        return bodyLenght;
    }

    public void setManeVolume(int bodyLenght){
        this.bodyLenght = bodyLenght;
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
