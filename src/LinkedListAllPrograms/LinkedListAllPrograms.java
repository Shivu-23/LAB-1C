package LinkedListAllPrograms;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;

public class LinkedListAllPrograms {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Yellow");

        System.out.println("Original List: " + list);

        // 1. Iterate from 2nd position using Iterator
        System.out.println("\n1. Iterate from 2nd position:");
        Iterator<String> it = list.listIterator(1); // index 1 = 2nd position
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 2. Iterate in reverse order
        System.out.println("\n2. Reverse iteration:");
        Iterator<String> rev = list.descendingIterator();
        while (rev.hasNext()) {
            System.out.println(rev.next());
        }

        // 3. Insert element at the end using offerLast()
        System.out.println("\n3. Insert 'Pink' at the end:");
        list.offerLast("Pink");
        System.out.println("Updated List: " + list);

        // 4. Display elements with positions
        System.out.println("\n4. Display elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + (i + 1) + ": " + list.get(i));
        }

        // 5. Swap first and third elements
        System.out.println("\n5. Swap 1st and 3rd elements:");
        if (list.size() >= 3) {
            Collections.swap(list, 0, 2);
            System.out.println("After Swapping: " + list);
        } else {
            System.out.println("Not enough elements to swap.");
        }
    }
}