public abstract class Person {
    protected String name;
    protected String surname;
    protected Integer passport;

    public Person(String name, String surname, Integer passport) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getPassport() {
        return passport;
    }
}
