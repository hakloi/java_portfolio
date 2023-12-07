import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("is");
        linkedList.add("a");
        linkedList.add("person");
        linkedList.add("with");
        linkedList.add("scary");

        linkedList.addFirst("This");
        linkedList.addLast("smile");

        // for
        System.out.println("Print all elements with FOR:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println();

        // foreach
        System.out.println("Print all elements with FOREACH:");
        for (String el : linkedList) {
            System.out.println(el);
        }
        System.out.println();

        //getLast()
        System.out.println("Last el: " + linkedList.getLast());
        System.out.println();

        // Создание ArrayList из LinkedList элементов
        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        // Сортировка arrayList в порядке убывания с помощью компаратора
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        // Распечатка отсортированного ArrayList
        System.out.println("Отсортированный ArrayList по убыванию:");
        for (String element : arrayList) {
            System.out.println(element);
        }
        System.out.println();

        // Сортировка arrayList в порядке возрастания с помощью компаратора
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // Распечатка отсортированного ArrayList
        System.out.println("Отсортированный ArrayList по возрастанию:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}