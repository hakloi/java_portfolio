// Write a function that accepts an integer n
// and a string s as parameters, and returns a
// string of s repeated exactly n times.


public class Repeat {
    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins 
        int repeat = 4;
        String string = "Viola";
        String res = string.repeat(repeat);
        System.out.printf("TEXT: %s", res);

        // code for CodeWarrior
        // public class Solution {
        //     public static String repeatStr(final int repeat, final String string) {
        //       String res = string.repeat(repeat);
        //       return res;
        //       }
        // }
        
    }
}
