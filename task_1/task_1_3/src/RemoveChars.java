// JAVA

// It's pretty straightforward. Your goal is to create
// a function that removes the first and last characters
// of a string. You're given one parameter, the original
// string. You don't have to worry with strings with less
// than two characters.


public class RemoveChars {
    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // here give a string
        String s = "[I want to eat...]";
        s = s.substring(1, s.length() - 1);
        System.out.printf("TEXT: %s", s);


        // // your code here for CodeWarrior
        // str = str.substring(1, str.length() - 1);
        // return str;
    }
}