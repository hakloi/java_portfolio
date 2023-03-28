public class HotDrink extends Drink{
    private Integer tempr;

    public HotDrink(Integer id, String name, Integer volume, Integer cost, Integer tempr){
        super(id, name, volume, cost);
        this.tempr = tempr;
    }

    public Integer getTemperature() {
        return tempr;
    } 

    @Override
    public String toString() {
        return "Name: " + name + "; Price: " + cost + "; Volume: " + volume + "; Temp: " + tempr  ;
    }
}
