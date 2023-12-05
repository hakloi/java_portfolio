import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //code
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input array size: ");
        while (!scanner.hasNextInt()) {
                System.out.print("Invalid value. \nInput array size: ");
                scanner.next(); // pass invalid value
            }
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input num: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid value. \nInput num: ");
                scanner.next(); // pass invalid value
            }
            int num = scanner.nextInt();
            array[i] = num;

            //поток для записи числа в файл
            Thread fileWritingThread = new Thread(new FileWritingTask(array));
            fileWritingThread.start();
        }

        scanner.close();
        // потоки для поиска максимума, минимума и суммы
        Thread maxThread = new Thread(new MaxTask(array));
        Thread minThread = new Thread(new MinTask(array));
        Thread sumThread = new Thread(new SumTask(array));

        maxThread.start();
        minThread.start();
        sumThread.start();
    }

    static class MaxTask implements Runnable {
        private final int[] array;

        public MaxTask(int[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            int max = Integer.MIN_VALUE;
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Max mum: " + max);
        }
    }

    static class MinTask implements Runnable {
        private final int[] array;

        public MinTask(int[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            int min = Integer.MAX_VALUE;
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
            }
            System.out.println("Min num: " + min);
        }
    }

    static class SumTask implements Runnable {
        private final int[] array;

        public SumTask(int[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.println("Sum: " + sum);
        }
    }

    static class FileWritingTask implements Runnable {
        private final int[] array;

        public FileWritingTask( int[] array) {

            this.array = array;
        }

        @Override
        public void run() {
            try {
                FileWriter writer = new FileWriter("array.txt", true);
                writer.write("\nNew array:\n");
                for (int num : array) {
                    writer.write(num + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}