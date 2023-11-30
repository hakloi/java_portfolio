public class Group {
    private Student[] students;
    private int size;

    public Group() {
        this.students = new Student[6];
        this.size = 0;
    }

    public void addStudent() {
        if (size >= 6) {
            try {
                throw new RuntimeException("Group is crowded!");
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                return;
            }
        }

        Student student = new Student();
        students[size] = student;
        size++;
    }

    public void addStudent(Student student) {
        if (size >= 6) {
            try {
                throw new RuntimeException("Group is crowded!");
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                return;
            }
        }

        students[size] = student;
        size++;
    }

    public void removeStudent(int index) {
        if (size <= 3) {
            System.err.println("Group is less than 3 people!");
            return;
        }

        if (index < 0 || index >= size) {
            System.err.println("Wrong Student ID!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }
        students[size - 1] = null; 
        size--;
    }

    public Student getStudent(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Wrong Student ID!");
            /*
            System.err.println выводит сообщение об ошибке в стандартный
            поток ошибок, а метод System.out.println выводит сообщение
            в стандартный поток вывода. 
            */
            return null;
        }

        return students[index];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < size; i++) {
            result.append("Student " + i + ": " + students[i] + "\n");
        }
        
        return result.toString();
    }
}