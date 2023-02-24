// Trolls are attacking your comment section!
// A common way to deal with this situation is to remove all
// of the vowels from the trolls' comments, neutralizing the threat.
// Your task is to write a function that takes a string and return a
// new string with all vowels removed.
// For example, the string "This website is for losers LOL!"
// would become "Ths wbst s fr lsrs LL!".
// Note: for this kata y isn't considered a vowel.

public class App {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        String str = "This website is for losers LOL!";
        // String new_str = str.replace("a", "")
        // .replace("i", "")
        // .replace("o", "")
        // .replace("u", "")
        // .replace("e", "");
        // System.out.print(new_str);
        String[] vow = { "a", "e", "i", "o", "u" };
        for (int i = 0; i < vow.length; i++) {
            str = str.replace(vow[i], "");
            str = str.replace(vow[i].toUpperCase(), "");
        }
        System.out.print(str);
    }
}
