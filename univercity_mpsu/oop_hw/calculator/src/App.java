import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
    }
}
