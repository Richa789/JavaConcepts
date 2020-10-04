package practice.Collections;

import java.lang.reflect.Array;
import java.util.*;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("John");
        list1.add("Jose");
        list1.add("Jenny");
        list1.add("Jack");
        list1.add("Jazz");
        System.out.println("Following is the linked list :" + list1);
        System.out.println("Using for loop :");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("Using foreach loop :");
        for (String str : list1) {
            System.out.println(str);
        }

        System.out.println("Using Iterator :");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Using ListIterator : ");
        ListIterator<String> lit = list1.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        System.out.println("First object is " + list1.getFirst());
        System.out.println("Last object is " + list1.getLast());

        System.out.println("Converting into arraylist : ");
        ArrayList<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);

        list1.add(0, "Rony");
        list1.add(5, "Jessica");
        System.out.println(list1);
        System.out.println(list1.indexOf("Rony"));
        System.out.println(list1.get(3));
        list1.set(2, "Monti");
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);
        if (list1.contains("Jack")) {
            System.out.println("Found the element");
        } else {
            System.out.println("Element not found");
        }
        Collections.sort(list1);
        System.out.println("After sorting " + list1);

        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Yellow");
        color.add("Green");
        color.add("Blue");
        list1.addAll(color);
        System.out.println("After adding colors " + list1);
        Collections.shuffle(list1);
        System.out.println("After shuffling " + list1);
        Collections.reverse(list1);
        System.out.println("After reversing " + list1);
        LinkedList<String> list3 = new LinkedList<>(list1.subList(0, 4));
        System.out.println(list3);
        System.out.println(list3.contains("John"));



    }
}



