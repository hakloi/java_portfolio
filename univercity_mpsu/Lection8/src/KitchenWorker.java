public class KitchenWorker extends Employee{
    protected int cookingSkill;

    public KitchenWorker(String name, String surname, String gender, boolean active, String position, double payment,
            double experience, String departament, int workDays, int cookingSkill) {
        super(name, surname, gender, active, position, payment, experience, departament, workDays);
        this.cookingSkill = cookingSkill;
    }
    
    public void cookRatatouille(){
        if (cookingSkill >= 5){
            System.out.println("\nPerfect ratatouille");
        } else {
            System.out.println("\nNot perfect ratatouille");
        }
    }

    @Override
    public String toString() {
        return "\n\t Name: " + name + "\n\t Surname: " + surname + "\n\t Gender: " + gender +
        "\n\t Active: " + active + "\n\n\t Position: " + position + "\n\t Payment: " + payment +
         "\n\t Expierence: " + experience + "\n\t Department: " + departament +
         "\n\t Work schedule: " + workDays + "\n\t Cooking skill:" + cookingSkill;
    }

}
