import java.io.IOException;
import java.util.Scanner;

public class InputScanner {
    private Scanner scanner;

    public InputScanner() {
        this.scanner = new Scanner(System.in);
    }

    public int getInputInt() throws IOException {
        return scanner.nextInt();
    }

    public double getInputDouble() throws IOException {
        return scanner.nextDouble();
    }

    public void close() {
        scanner.close();
    }
}