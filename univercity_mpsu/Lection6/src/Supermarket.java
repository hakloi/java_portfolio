public class Supermarket extends Shop{
    private double area;
    private String[] categories;

    public Supermarket(int countCash, int countCasher, Shop.Product[] product,
    double area, String[] categories) {
        super(countCash, countCasher, product);
        this.area = area;
        this.categories = categories;
    }

    public double areaEfficiency() {
        return area / categories.length;
    }

    @Override
    public double Efficiency() {
        double cashEfficiency = cashEfficiency();
        double areaEfficiency = areaEfficiency();
        return (areaEfficiency * cashEfficiency);
    }
    
}
