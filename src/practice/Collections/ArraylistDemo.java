package practice.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
   String name;
   int roll;

    public Student(String john, int i) {
    }

    public Student() {

    }
}

public class ArraylistDemo {
    public static void main(String[] args) {
        Student studObj = new Student();
        studObj.name = "Jessica";
        studObj.roll = 786;

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList();
        ArrayList<Integer> list3 = new ArrayList();

        list1.add("John");
        list1.add("Jenny");
        list1.add("Jack");
        list1.add("Joe");
        list1.add("Jessie");
        System.out.println("List1 contains : " + list1);

        list2.add(123);
        list2.add('s');
        list2.add(3.5);
        list2.add(77.89);
        list2.add("Richa");
        list2.add(studObj);
        System.out.println("List2 contains : " + list2);

        String name = list1.get(3);
        System.out.println("Name is " + name);
        Object obj = list2.get(3);
        System.out.println("Value is " + obj);

        list1.set(2, "Monica");
        System.out.println("Updated list1 is " + list1);

        list2.remove(2);
        System.out.println("List2 after removing is " + list2);

        if (list1.contains("Monica")) {
            System.out.println("Monica is in the list1");
        }
        for (String fullList : list1) {
            System.out.println(fullList);
        }
        System.out.println("List2 using iterating is :");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("List1 using iterator is :");
        Iterator<String> itr = list1.iterator();
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if (str.equals("Jenny")) {
                itr.remove();
            }
        }
        System.out.println("After iteration list1 is : " + list1);

        list3.add(12);
        list3.add(32);
        list3.add(54);
        list3.add(21);
        list3.add(10);
        Collections.sort(list3);
        System.out.println("Sorting an array in ascending order is : " + list3);

        list1.addAll(list2);
        System.out.println("After adding list1 is : " + list1);

        //list1.removeAll(list1);
        //System.out.println(list1.isEmpty() + " because it is : " + list1);
        System.out.println(list2.isEmpty());
        System.out.println(list2.contains(123));

        Collections.reverse(list3);
        System.out.println("Reverse order of list3 is : " + list3);

        list1.removeAll(list2);
        System.out.println("Updated list1 is : " + list1);

        Collections.sort(list1);
        System.out.println("Sorting of String elements based on unicodes is : " + list1);


        for (Object data : list3) {
            System.out.println(data);
        }
    }
}











