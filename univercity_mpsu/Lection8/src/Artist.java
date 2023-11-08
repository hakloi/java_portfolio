public class Artist extends Employee {
    private int numOfArts;
    private String movement; 
    private int speedOfDrawning;
    

    public Artist(String name, String surname, String gender, boolean active, String position, double payment,
            double experience, String departament, int numOfArts, String movement, 
            int workDays, int speedOfDrawning) {
        super(name, surname, gender, active, position, payment, experience, departament, workDays);
        this.numOfArts = numOfArts;
        this.movement = movement;
        this.speedOfDrawning = speedOfDrawning;
    }

    public int artInDay() {
        System.out.print("Arts in week: ");
        return speedOfDrawning*workDays;
    }

    
    @Override
    public String toString() {
        return "\n\t Name: " + name + "\n\t Surname: " + surname + "\n\t Gender: " + gender +
        "\n\t Active: " + active + "\n\n\t Position: " + position + "\n\t Payment: " + payment +
         "\n\t Expierence: " + experience + "\n\t Department: " + departament +
         "\n\t Number of arts: " + numOfArts + "\n\t Movement: " + movement + 
         "\n\t Work schedule: " + workDays;
    }

}
