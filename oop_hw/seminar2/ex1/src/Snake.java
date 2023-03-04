public class Snake extends Animals{
    private int bodyLenght;

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
}
