public class Drink {
    private Integer id;
    private String name;
    private Integer volume;

    public Drink(Integer id, String name, Integer volume) {
        this.id = id;
        this.name = name;
        this.volume = volume;
    }

    public Drink(Integer id2, String name2, Integer volume2, Integer cost) {
    }

    @Override
    public String toString() {
        return "Drink [id=" + id + ", name=" + name + ", volume=" + volume + "]";
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

}