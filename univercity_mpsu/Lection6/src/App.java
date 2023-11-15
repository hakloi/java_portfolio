public class App {
    public static void main(String[] args) throws Exception {
        Shop.Product[] items = new Shop.Product[3];
        items[0] = new Shop.Product("milk", 1000, 100);
        items[1] = new Shop.Product("bread", 40, 50);
        items[2] = new Shop.Product("eggs", 200, 160);
        Shop spar = new Shop(2, 5, items );

        System.out.print(spar.toString());

        System.out.println();
        String[] categories = {"1", "dasha", "loch"};
        Supermarket sup = new Supermarket(2, 5, items, 1000.0, categories);
        System.out.println(sup.toString());
    }
}
