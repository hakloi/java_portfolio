import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        String[] arrayData = ReadFile("text.txt");
        for (int i = 0; i < arrayData.length; i++) {
            System.out.println(PrintFile(arrayData[i]));
        }
    }

    // чтение файла
    public static String[] ReadFile(String text) throws Exception {
        // читает текст из потока ввода символов, буферизуя прочитанные символы,
        BufferedReader br = new BufferedReader(new FileReader(text));
        String str;
        int size = 0;
        // считываем по строчно с readline + к size для создания новго массива строк 
        while ((str = br.readLine()) != null) {
            size += 1;
        }
        // обязательно закрываем br 
        br.close();
        String[] listData = new String[size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(text));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;
    }

    // выводим в консоль файл
    public static StringBuilder PrintFile(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        // разделим строки с помощью ,
        String[] arrayData = line5.split(",");
        String[] listName = { "Студент ", " получил ", " по предмету " };
        for (int i = 0; i < arrayData.length; i++) {
            
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}
