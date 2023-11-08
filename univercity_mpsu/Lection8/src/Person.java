public class  Person {
    protected String name;
    protected String surname;
    protected String gender;
    protected boolean active;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public boolean isActive() {
        return active;
    }

    public Person(String name, String surname, String gender, boolean active) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.active = active;
    }

    public void sleep(Person person) {
        if (person.active){
            System.out.printf("\nThis sim '%s %s' is not sleep!", person.name, person.surname);
        } else {
            System.out.println("\nYour sim need to sleep! Don't disturb!");
        }
    }

    @Override
    public String toString() {
        return "\n\t Name:" + name + "\n\t Surname:" + surname + "\n\t Gender:" + gender +
                    "\n\t Active:" + active;
    }
}
