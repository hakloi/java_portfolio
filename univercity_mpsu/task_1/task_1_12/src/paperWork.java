// Your classmates asked you to copy some paperwork for them. You know that
// there are 'n' classmates and the paperwork has 'm' pages.
// Your task is to calculate how many blank pages do you need.
// If n < 0 or m < 0 return 0.

public class paperWork {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        int n = -5;
        int m = 5;
        if (n < 0 || m < 0){
            System.out.print(0);
        } else {
            int res = m*n;
            System.out.print(res);
        }
    }
}
