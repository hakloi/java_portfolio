import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

public class App {
    public static void main(String[] args) throws Exception {
        //clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        LinkedList<Object> listFirst = CreateList();
        printList(listFirst);
        ReverseList(listFirst);
        System.out.println();
        printList(listFirst);
    }

    // создаем 
    public static LinkedList<Object> CreateList(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        return list;
    }

    // выводим в консоль
    public static void printList(LinkedList<Object> list){
        for(Object el: list){
            System.out.printf(el + " ");
        }
    }

    // переворачиваем
    public static void ReverseList(LinkedList<Object> list){
        int n = list.size()/2;
        int m = list.size();
        for(int i = 0; i < n; i++){
            Object temp = list.get(i);
            list.set(i, list.get(m-i-1));
            list.set(m-i-1, temp);
        }
    }
}
