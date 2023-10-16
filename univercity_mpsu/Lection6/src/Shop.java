public class Shop {
    private int countCash, countCasher;
    private Product[] product;

    public Shop(int countCash, int countCasher, Shop.Product[] product){
        this.countCash = countCash;
        this.countCasher = countCasher;
        this.product = product;
    }

    public double averageWeight() {
        double sum = 0;
        for(Shop.Product p : product) {
            sum = sum + p.getWeight();
        }
        // calculate average
        return sum / product.length;
    }

    public double cashEfficiency() {
        return (double) countCasher / countCash;
    }

    public double Efficiency() {
        double averageWeight = averageWeight();
        double cashEfficiency = cashEfficiency();
        return averageWeight / cashEfficiency;
    }

    @Override
        public String toString() {
            return ("\n\tEfficiency = " + Efficiency()
            + "\n\tEfficiency of cash = " + cashEfficiency()
            + "\n\tAverage weight of products = " + averageWeight());
        }
    

    public static class Product {
        private double weight;
        private double price;

        public Product(double weight, double price) {
            this.weight = weight;
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public double getPrice() {
            return price;
        }
    }
}
