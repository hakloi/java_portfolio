public class Circle extends Figure {
    private Double radius;

    public Circle(String color, String name, Double radius){
        super(color, name);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Figure's name: " + name + "; \nColor:" + color;
    }

}
