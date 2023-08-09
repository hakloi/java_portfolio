import java.io.File;

public class App {
        public static void main(String[] args){
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(getFileSize(new File("/Users/HP/Desktop/portfolio/books (in progress)/GameDesign.pdf")));
    }

    public static long getFileSize(File file) {
        if (!file.exists()){
            return -1;
        }
        return file.length();
    }
}
