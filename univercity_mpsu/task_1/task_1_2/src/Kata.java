// JAVA
// Simple, remove the spaces from the string,
// then return the resultant string.

public class Kata {
    public static void main(String[] args) throws Exception {
        // чистит консоль
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        String str = "People born under the sign of Leo are natural born leaders.";
        System.out.printf("original: %s%n", str);

        str = str.replace(" ", "");
        System.out.printf("transformed: %s", str);

        // code for CodeWarriors begins here

        // public class Kata {
        //     public static String noSpace(final String x) {
        //         String res = x.replace(" ", "");
        //         return res;
        //     }
        // }
    }
}
