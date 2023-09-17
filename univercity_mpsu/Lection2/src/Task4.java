public class Task4 {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //code begins
        int end = 62;

        for (int i = 25; i <= end; i++){
            if (i % 2 == 0){
                System.out.printf("%d ", i);
            } 
        }
    }
}
