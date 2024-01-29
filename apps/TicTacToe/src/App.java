import javax.swing.JFrame;

public class App extends JFrame {
    public App() {
        super("Hello World");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        App app = new App();
    }
}