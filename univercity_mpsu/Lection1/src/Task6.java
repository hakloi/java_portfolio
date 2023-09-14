public class Task6 {
    public static void main(String[] args) {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int first = 25/13;
        int second = 13/5;
        int third = 29-45;
        int fouth = third + second;
        int fifth = 12*fouth;
        System.out.println(first + fifth);
    }
}

