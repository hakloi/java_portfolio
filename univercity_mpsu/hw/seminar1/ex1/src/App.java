import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел
// от 1 до n), n! (произведение чисел от 1 до n)

public class App {
    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

        // проверка на число
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            int res = 1;
            // формула факториала
            for (int i = 1; i <= num; i++) {
                res = res * i;
            }
            System.out.println("Произведение чисел от 1 до " + num + " равно = " + res);

            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println("Сумма чисел от 1 до " + num + " равна = " + sum);
        } else {
            System.out.println("Ошибка! Перезапустите программу и попробуйте снова!");
        }

        // закрытие сканнера
        sc.close();
    }
}
