// ATM machines allow 4 or 6 digit PIN codes and PIN
// codes cannot contain anything but exactly 4 digits or exactly 6 digits.
// If the function is passed a valid PIN string,
// return true, else return false.

public class validatePin {
    public static void main(String[] args) throws Exception {
        String str = "1235123";
        // .chars() transform to char
        // allMatch check each characters - isDigit
        int length = str.length (); 
        if ((length == 6) || (length == 4)) {
            boolean isNumeric = str.chars().allMatch(Character::isDigit);
            if (isNumeric == true) {
                System.out.print(isNumeric);
            } else {
                System.out.print(isNumeric);
            }
        }else{
            System.out.print(false);
        }

    }
}
