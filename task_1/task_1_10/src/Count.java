// JAVA
// Given an array of integers.
// Return an array, where the first element
// is the count of positives numbers and the
// second element is sum of negative numbers.
// 0 is neither positive nor negative.
// If the input is an empty array or is null,
// return an empty array.
// For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15],
// you should return [10, -65].

public class Count {
    // public static void main(String[] args) throws Exception {
    // // clean console
    // System.out.print("\033[H\033[2J");
    // System.out.flush();

    // // code begins
    // int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14,
    // -15};
    // int[] result = resultArray(array);

    // for (int i = 0; i < result.length; i++){
    // System.out.print(result[i] + " ");
    // }
    // }

    // public static int[] resultArray(int[] array){
    // int first = 0;
    // int last = 0;
    // for (int i = 0; i < array.length; i++){
    // if (array[i] > 0){
    // first = first + 1;
    // } else {
    // last = last + array[i];
    // }
    // }
    // int[] res = {first, last};
    // return res;
    // }

    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 };
        int first = 0;
        int last = 0;;
        if (array.length == 0 || array == null) {
            System.out.print("null");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    first = first + 1;
                } else {
                    last = last + array[i];
                }
            }
            System.out.print("{" + first + "," + last + "}");
        }
    }
}
