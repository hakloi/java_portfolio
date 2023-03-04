public class Lion extends Animals {
    private int maneVolume;

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
}
