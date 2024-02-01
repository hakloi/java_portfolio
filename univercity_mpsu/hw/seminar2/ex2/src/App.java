// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;
public class App {
    public static void main(String[] args) throws IOException {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        Logger logger = Logger.getLogger(App.class.getName());
        FileHandler fh = new FileHandler("ex2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");

        //выводим массив из рандом чисел с помощью метода
        System.out.printf("\nМассив:\n");
        int[] arr = RandomArray();

        //выводим отсортированный массив 
        int[] newArr = listSort(arr);
        System.out.printf("\nОтсортированный массив: \n");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    // пузырьковый метод
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    // создадим массив из рандом чисел
    public static int[] RandomArray() {
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
    
}
