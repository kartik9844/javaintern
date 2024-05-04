import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListOperations4 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Iterating over the LinkedList
        System.out.println("Iterating over the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Using a descending iterator
        System.out.println("Using a descending iterator:");
        Iterator<String> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
