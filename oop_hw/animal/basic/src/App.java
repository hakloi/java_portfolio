import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        Animal<Cat> cat = new Animal<>();
        cat.setGeneric(List.of(new Cat("Viola") ));
        System.out.println(cat.info());
        
    }
}
