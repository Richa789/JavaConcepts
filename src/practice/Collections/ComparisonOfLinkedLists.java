package practice.Collections;

import java.util.Collections;
import java.util.LinkedList;

public class ComparisonOfLinkedLists {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Red");
        list1.add("White");
        list1.add("Pink");
        list1.add("Yellow");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Red");
        list2.add("Black");
        list2.add("Pink");
        list2.add("Green");

        LinkedList<String> list3 = new LinkedList<>();
        for(String str : list1)
            list3.add(list2.contains(str)?"Yes":"No");
        System.out.println(list3);
        System.out.println("List1 is : " + list1);
        Collections.swap(list1,0,1);
        System.out.println("After swapping first two elements : " + list1);
        list1.addAll(list2);
        System.out.println(list1);
        LinkedList<String> newlist = (LinkedList<String>)list1.clone();
        System.out.println("Cloned list : " + newlist);
        list2.clear();
        System.out.println("List2 : " + list2);
        System.out.println(list2.isEmpty());
        



    }

    }

