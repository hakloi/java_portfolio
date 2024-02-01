package v1;
import java.util.Random;

public abstract class Person {
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    public Person(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

}
