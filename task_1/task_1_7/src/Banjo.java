/* Are You Playing Banjo?
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!
The function takes a name as its only argument, and returns one of the following strings:
name + " plays banjo" 
name + " does not play banjo"
Names given are always valid strings.
*/

public class Banjo {
  public static void main(String[] args) throws Exception {
    // clean console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    // code begins 
    System.out.printf("Are you playing banjo?%n");
    String name = "Ronald";
    char firstLetter = name.charAt(0);

    if (firstLetter == 'r' || firstLetter == 'R') {
      System.out.print(name + " plays banjo");
    } else {
      System.out.print(name + " does not play banjo");
    }
  }
}
