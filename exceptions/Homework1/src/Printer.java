class Answer {
    public void arrayOutOfBoundsException() {
        try {
          
        }catch(ArrayIndexOutOfBoundsException ans){
            
        }
      
}

    public void divisionByZero() {
        try {
          
        } catch (ArithmeticException ans) {}
      
}

    public void numberFormatException() {
        try {

        } catch (NumberFormatException ans) {

        }
       
 }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}