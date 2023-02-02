public class App {
    public static void main(String[] args) throws Exception {

        long sq = 9801;
        long root = (long) Math.sqrt(sq);
        System.out.print(root * root == sq ? (root + 1) * (root + 1) : -1);


        // if (Math.sqrt(sq) == (int) Math.sqrt(sq)) {
        //     long res = sq + 1;
        //     boolean found = false;
        //     while (!found) {
        //         if (Math.sqrt(res) == (int) Math.sqrt(res)) {
        //             found = true;
        //             break;
        //         }
        //         res++;
        //     }
        //     System.out.print(res);
        // } else {
        //     System.out.print("-1");
        // }
    }
}
