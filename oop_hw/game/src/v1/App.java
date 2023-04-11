package v1;

import java.util.ArrayList;
import java.util.List;

import v1.Healers.Wally;
import v1.Warriors.Juno;
import v1.Warriors.Monic;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> team1 = new ArrayList<>();
        team1.add(new Wally());
        team1.add(new Juno());
        team1.add(new Monic());
    }
}
