import java.util.Scanner;

// Реализовать простой калькулятор (пользователь вводит
// 2 числа и вводит операцию (+ - / *). int a ; int b;
// String op (op!=”Stop”); (char != ’b’)

public class App {
    public static void main(String[] args) {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        System.out.println("Введите первое и второе числа:");
        // сканнер
        Scanner inp = new Scanner(System.in);
        // невозможно ввести два сканнера, необходимо вводить по очереди перменные
        int num1, num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("Выберите число для операции:\n 1) +\n 2) -\n 3) *\n 4) :");
        int choose;
        choose = inp.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Сложение: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Вычитание: " + sub(num1, num2));
                break;
            case 3:
                System.out.println("Умножение: " + mult(num1, num2));
                break;
            case 4:
                System.out.println("Деление: " + div(num1, num2));
                break;
            default:
                System.out.println("Такой операции нет!");

        }

        // закрываем сканнер
        inp.close();

    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int div(int x, int y) {
        int result = x / y;
        return result;
    }

}
