public class App {
    public static void main(String[] args) throws Exception {
        // clean terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        //code
        Group group = new Group();

        // ОШИБКА ловит искл, не дает удалить index , так как будет меньше студентов чем 3
        group.addStudent(new Student(20, "male", "Kick", "Butovski", "Punch", 1, 3.8));
        group.addStudent(new Student(19, "female", "Joan", "of Arc", "Saint", 3, 4.9));
        group.addStudent(new Student(19, "male", "Alexander", "Hamilton", "Father", 3, 5.0));
        // group.removeStudent(0);

        //ОШИБКА ловит исключение , продолжает работу, не печатает Anna Karenina 
        // group.addStudent(new Student(20, "male", "Juba", "Pupa", "-", 2, 2.5));
        // group.addStudent(new Student(50, "male", "Santa", "Clause", "-", 3, 4.5));
        // group.addStudent(new Student(49, "male", "Ded", "Moroz", "-", 4, 5.0));
        // group.addStudent(new Student(29, "female", "Anna", "Karenina", "-", 4, 5.0));

        // ОШИБКА неверный возраст ВЫБРАСЫВАЕТ ОШИБКУ ЧЕРЕЗ EXCEPTION
        // group.addStudent(new Student(890, "alien", "4LLLL4", "XZXX785ZXZXX", "PPPPPP2346", 4, 5.0));

        // ОШИБКА неверные индексы
        // group.removeStudent(8);
        // group.getStudent(8);
        System.out.println(group);
    }
}
