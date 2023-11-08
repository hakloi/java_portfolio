public class Oguzok extends KitchenWorker{
    private int amountOfMarks;
    private int speed;
    private int respect;

    public Oguzok(String name, String surname, String gender, boolean active, String position, double payment,
            double experience, String departament, int workDays, int cookingSkill, int amountOfMarks,
            int speed, int respect) {
        super(name, surname, gender, active, position, payment, experience, departament, workDays, cookingSkill);
        this.amountOfMarks = amountOfMarks;
        this.speed = speed;
        this.respect = respect;
    }

    public int cleanBananas(){
        System.out.println("\nОгузок, чисти бананы!");
        if (respect == 1){
            System.out.println("All done!");
            return amountOfMarks*speed;
        } else {
            System.out.println("Ну шеееф(((");
            return amountOfMarks*speed-5;
        }
    }
    
    @Override
    public String toString() {
        return "\n\t Name: " + name + "\n\t Surname: " + surname + "\n\t Gender: " + gender +
        "\n\t Active: " + active + "\n\n\t Position: " + position + "\n\t Payment: " + payment +
         "\n\t Expierence: " + experience + "\n\t Department: " + departament +
         "\n\t Work schedule: " + workDays + "\n\t Cooking skill: " + cookingSkill;
    }
}
