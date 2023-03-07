package factory;
import java.util.ArrayList;
import animals.Lion;

public class LionFactory {
    public static void main(String[] args) {
        ArrayList<Lion> lions = new ArrayList<Lion>();
    }

    static public ArrayList<Lion> createLions(int lionCount){
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
    }
}
