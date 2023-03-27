public class HotDrink {
    protected int volume;
    protected String name;
    protected int cost;

    public HotDrink(String name, int volume, int cost) {
        this.name = name;
        this.volume = volume;
        this.cost = cost;
    }

    public String getInfo() {
        return String.format("Name: %s  Volume: %d  Temp: %d  Cost: %d",
                this.name, this.volume, this.temperature, this.cost));
    }
}
