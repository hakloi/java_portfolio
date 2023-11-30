public class Student {
    private int age;
    private String gender;
    private String firstName;
    private String lastName;
    private String middleName;
    private int year;
    private double averageScore;

    /*
    перегрузка метода :
    компилятор Java выбирает наиболее подходящий вариант метода для выполнения
    */ 

    public Student() {
        // добавление в систему Group
    }

    public Student(int age, String gender, String firstName, String lastName, String middleName, int year, double averageScore) throws NotCurrectAgeException {
        // заполнение 
        setAge(age);
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.year = year;
        this.averageScore = averageScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NotCurrectAgeException {
        if (age < 16 || age > 60) {
            throw new NotCurrectAgeException("Incorrect age. The age should be in the range from 16 to 60.");
        }

        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "\nFirst Name: " + firstName +
                "\tLast Name: " + lastName +
                "\tMiddle Name: " + middleName +
                "\tAge: " + age +
                "\tGender: " + gender +
                "\tYear: " + year +
                "\tScore: " + averageScore;
    }
}

class NotCurrectAgeException extends Exception {
    public NotCurrectAgeException(String message) {
        super(message);
    }
}

/*
 * конструктор NotCurrectAgeException 
 * вызывает родитель класс Exception с сообщением
 * super(message);
 */