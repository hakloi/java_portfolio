import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // clear terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //code
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("is");
        linkedList.add("a");
        linkedList.add("person");
        linkedList.add("with");
        linkedList.add("a");
        linkedList.add("scary");

        linkedList.addFirst("this");
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
        System.out.println("Last el: " + linkedList.peekLast());
        System.out.println();

        //ArrayList 
        ArrayList<String> arrayList = new ArrayList<>(linkedList);

         /**
         * Compares two strings lexicographically.
         * The comparison is based on the Unicode value of each character in
         * the strings.
         **/

        // сортировка убывание по алфавиту
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); 
            }
        });

        System.out.println("Sorted ArrayList (in descending order):");
        for (String el : arrayList) {
            System.out.println(el);
        }
        System.out.println();

        //сортировка возрастание по алфавиту
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("Sorted ArrayList (in ascending order):");
        for (String el : arrayList) {
            System.out.println(el);
        }
    }
}