// JAVA
// Create a function that takes an integer as an argument
// and returns "Even" for even numbers or "Odd" for odd numbers.

public class EvenOrOdd {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        int number = 25;
        if (number % 2 == 0){
            System.out.printf( number + " - even");
          } else{
            System.out.printf( number + " - odd");
          }

        //   //code for CODEWARRIOR
        // if (number % 2 == 0){
        //     return "Even";
        //   } else{
        //     return "Odd";
        //   }

        // return (number % 2 == 0) ? "Even" : "Odd";
    }
}
