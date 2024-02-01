import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее ариф из этого списка.

public class App {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        MinMaxAverage(getRandomList());
    }

    public static List<Integer> getRandomList() {
        Random random = new Random();
        int size = 10;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(15));
        }
        System.out.printf("Массив:\n" + list.toString());
        return list;
    }

    public static void MinMaxAverage(List<Integer> list){
        System.out.printf("\nМинимальное число: " + Collections.min(list));
        System.out.printf("\nМаксимальное число: " + Collections.max(list));

        int count = list.size();
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        double average = sum/count;
        System.out.printf("\nСреднее арифметическое: " + sum + " : " + count + " = " + average);
        
    }
}
