// JAVA
// Given a string of digits, you should replace any
// digit below 5 with '0' and any digit 5 and above
// with '1'. Return the resulting string.

public class FakeBinary {
    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        String str = "123456789";
        String result = str.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
        System.out.print(result);
    }
}
