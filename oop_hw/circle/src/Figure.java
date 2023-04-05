public abstract class Figure {
    protected String color;
    protected String name;
    protected Double length; 
    protected Double area; 
    protected Double volume;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Double getLength() {
        return length;
    }

    public Double getArea() {
        return area;
    }

    public Double getVolume() {
        return volume;
    }
}
