import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// 1) Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

public class App {
    public static void main(String[] args) {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        Map<String, List<String>> phonBook = new HashMap<>();
        phonBook.put("Daria", List.of("94035", "11111"));
        phonBook.put("Sasha", List.of("123456", "86768"));
        phonBook.put("Larisa", List.of("098066", "892624"));

        menu(phonBook);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }

    public static void find(Map<String, List<String>> phonBook) {
        System.out.print("Имя: ");
        String name = scanner();
        System.out.println(phonBook.get(name));
    }

    public static void allBook(Map<String, List<String>> phonBook) {
        System.out.println(phonBook);

    }

    public static Map<String, List<String>> add(Map<String, List<String>> phonBook) {
        System.out.println("Введите 'stop'");
        System.out.print("Имя: ");
        String name = scanner();
        List<String> number = new ArrayList<>();
        while (true) {
            System.out.print("Номер: ");
            String phon = scanner();
            if (phon.equals("stop")) {
                break;
            } else {
                number.add(phon);
            }
        }
        phonBook.put(name, number);

        return phonBook;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> phonBook) {
        System.out.println(
                "Введите команду из списка: \nfind - найти контакт \nadd - добавить контакт \nall - показать всю телефонную книгу \nexit - выйти");
        while (true) {
            String comands = scanner();
            if (comands.equals("exit")) {
                break;
            } else {
                switch (comands) {
                    case "find":
                        find(phonBook);
                        break;
                    case "add":
                        add(phonBook);
                        break;
                    case "all":
                        allBook(phonBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phonBook;
    }
}