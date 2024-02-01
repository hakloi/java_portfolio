// JAVA
// Write a function feast that takes the animal's
// name and dish as arguments and returns true or
// false to indicate whether the beast is allowed
// to bring the dish to the feast.


public class Feast {
    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins 
        String beast = "great blue heron";
        String dish = "garlic naan";
        char firstBeast = beast.charAt(0); 
        char firstDish = dish.charAt(0);
        char lastBeast = beast.charAt(beast.length() -1); 
        char lastDish = dish.charAt(dish.length() - 1);
        if (firstBeast == firstDish && lastBeast == lastDish){
            // return true;
            System.out.print("true");
        } else {
            // return false;
            System.out.print("false");
        } 
    }
}
