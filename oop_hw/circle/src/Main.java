public class Main {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        Creation figure0 = new Creation();
        figure0.addFigure(new Circle("yellow", "circle A", 12.0));

        System.out.print("Hello, geeks!\nDo you want to create some figures?");
        System.out.print("\nYour figures now:");
        System.out.print(figure0);
    }
}
