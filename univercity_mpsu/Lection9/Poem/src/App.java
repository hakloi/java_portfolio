import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
        public static void main(String[] args) {
        try {
            String line;
            int totalVowels = 0;
            int totalConsonants = 0;
            String textInBold = "Java_Prof_Level";

            FileReader fileReader = new FileReader("..//Poem//src//Girl.txt");
            /*
             * я использовала BufferedReader для построчного чтения
             * методом readLine(). каждая строка сохр в line 
             * + BufferedReader эффективнее читает большие объемы данных 
             */
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("..//Poem//src//Result.txt");

            while ((line = bufferedReader.readLine()) != null) {
                int vowels = 0;
                int consonants = 0;
                
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) { // вызываем метод 
                        if (isVowel(c)) {
                            vowels++;
                        } else {
                            consonants++;
                        }
                    }
                }
                
                // запись результата 
                fileWriter.write("Line: " + line);
                fileWriter.write("\nVowels: " + vowels + ", \nConsonants: " + consonants + "\n");
                totalVowels += vowels;
                totalConsonants += consonants;

                // консоль
                System.out.println("Line: " + line);
                System.out.println("Vowels: " + vowels + ", \nConsonants: " + consonants + "\n");
            }
        
        bufferedReader.close();
        fileWriter.close();
        System.out.println("\033[0;1m" + "Total vowels: " + totalVowels + "\nTotal consonants: "
                            + totalConsonants + "\033[0;0m");

        } catch (IOException err) {
            err.printStackTrace(); //инф об исключении: тип, соо и последовательность вызова метода
        }
    }
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }
}
