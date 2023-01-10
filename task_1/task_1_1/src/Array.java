// Заполните массив случайным числами и выведите максимальное,
// минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(),
// который возвращает значение в промежутке [0, 1].

public class Array {
    public static void main(String[] args) throws Exception {

        // чистит консоль
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // создаем массив из вещественных чисел 
        double arr[] = new double[6];
        System.out.printf("Массив:%n");
        for (int i = 0; i < arr.length; i++) {
            // метод Math.random() возвращает double [0,1]
            arr[i] = Math.random();
            System.out.printf(arr[i] + "%n");
        }

        // переменные max , min, average
        double max = arr[0];
        double min = arr[0];
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            average += arr[i] / arr.length;
        }

        System.out.printf("%nМаксимальное значение: " + max);
        System.out.printf("%nМинимальное значение: " + min);
        System.out.printf("%nСреднее значение: " + average);
    }

}
