package practice.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Predicate;

public class SortingReversingObjects {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Monica");
        list1.add("Richa");
        list1.add("Mili");
        list1.add("Monti");
        list1.add("Cutie");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Priya");
        list2.add("Ranu");
        list2.add("Mansi");
        list2.add("Nisha");
        list2.add("Pie");

        System.out.println("First students list is : " + list1);
        System.out.println("Second students list is : " + list2);
        list1.addAll(list2);
        System.out.println("Updated first students is : " + list1);

        Collections.sort(list1);
        System.out.println("After sorting first list is as follows : " + list1);


        System.out.println("Printing the alternate elements :");
        for (int i = 0; i < list1.size(); i += 2) {
            System.out.println(list1.get(i));
        }
    }
}








