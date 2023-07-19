import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> availableDivider = findSimpleNumber(100);
        for (Integer integer : availableDivider) {
            System.out.println(integer);
        }
    }

    public static List<Integer> findAvailableDivider(int number){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++ ){
            if (number % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumber (int max) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i<=max; i++){
            boolean simple = true;
            for (int j = 2; j <1; j++){
                if (i%j == 0){
                    simple = false;
                }
            }
            if (simple){
                result.add(i);
            }
        }
        
        return result;
    }
}
