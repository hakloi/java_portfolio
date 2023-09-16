public class Task1 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        double num = 23.2;
        int result = (int)Math.round(num);
        System.out.println(result);  
    }
}
