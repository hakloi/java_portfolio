import java.io.File;

public class App {
        public static void main(String[] args){
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();
    
        System.out.println(getFileSize(new File("/Users/HP/Desktop/portfolio/books (in progress)/GameDesign.pdf")));
        System.out.println(DivideZero.Divide(10, 6));
        System.out.println(TryCatch.TryCatchException());

        System.out.println(TryDouble.DivideArrays());

        for (int i = 0; i < 3; i++){
            TrowDemo.Exc(i);
            System.out.println();
        }
    }

    public static long getFileSize(File file) {
        if (!file.exists()){
            return -1;
        }
        return file.length();
    }
}
