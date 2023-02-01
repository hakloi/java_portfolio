// Simple, given a string of words, return the length
// of the shortest word(s).
// String will never be empty and you do not need to
// account for different data types.

public class findShort {
    public static void main(String[] args) throws Exception {
        String s = "I want to be your rat";
        String[] words = s.split(" ");
        int minLength = 10;
        for (int i =0; i < words.length; i++){
            System.out.println(words[i]);
            if (words[i].length() < minLength) {
                // Change the min
                minLength = words[i].length();
            }

        }
        System.out.println(minLength);
    }
}
