public class App {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        String s = "aaabbbbhaijjjm";
        String result = s.replaceAll("[a-m]", "").length() + "/" + s.length();
        System.out.print(result);
        
    }
}
