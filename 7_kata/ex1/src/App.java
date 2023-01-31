// Complete the solution so that it returns true if the first argument(string)
// passed in ends with the 2nd argument (also a string).

public class App {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        String c1 = "abc";
        String c2 = "d";
        if (c1.endsWith(c2)){
            System.out.print("true");
        }else{
            System.out.print("false");
        }


        // return (str.endsWith(ending)) ? true : false;
    }
}
