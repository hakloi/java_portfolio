public class Employee extends Person implements Worker  {
    protected String position;
    protected double payment;  
    protected double experience;
    protected String departament;
    protected int workDays;
    
    public int getWorkDays() {
        return workDays;
    }

    public String getPosition() {
        return position;
    }

    public double getPayment() {
        return payment;
    }

    public double getExperience() {
        return experience;
    }

    public String getDepartament() {
        return departament;
    }

    public Employee(String name, String surname, String gender, boolean active,
                    String position, double payment, double experience,
                    String departament, int workDays) {
        super(name, surname, gender, active);
        this.position = position;
        this.payment = payment;
        this.experience = experience;
        this.departament = departament;
        this.workDays = workDays;
    }

    @Override
    public void work() {
        System.out.printf("\n%s in %s is working now!", position, departament);
    }

    @Override
    public void getMoney() {
        System.out.printf("\n%f EARNED", payment);
    }

    @Override
    public void leave() {
        System.out.print("\nFinally, the workday is over...");
    }
    
    @Override
    public String toString() {
        return "\n\t Name: " + name + "\n\t Surname: " + surname + "\n\t Gender: " + gender +
        "\n\t Active: " + active + "\n\n\t Position: " + position + "\n\t Payment: " + payment +
         "\n\t Expierence: " + experience + "\n\t Department: " + departament +
         "\n\t Work schedule: " + workDays;
    }
}
