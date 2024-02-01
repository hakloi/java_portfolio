public class Cat extends BasicAnimal {
    String name;

    public Cat(String name) {this.name = name;}

    @Override
    public String toString() {
        return "\nCAT" +
                "\n1) Name: " + name;
    }
}
