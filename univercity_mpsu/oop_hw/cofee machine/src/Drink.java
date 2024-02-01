public abstract class Drink {
    protected Integer id;
    protected Integer volume;
    protected String name;
    protected Integer cost;

    public Drink(Integer id, String name, Integer volume, Integer cost) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getCost() {
        return cost;
    }
}
