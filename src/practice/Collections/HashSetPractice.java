package practice.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public static void main(String[] args) {

        HashSet<Object> list1 = new HashSet<>();
        list1.add("John");
        list1.add("Jack");
        list1.add(123);
        list1.add('A');
        list1.add(null);
        System.out.println("HashSet Objects are : " + list1);
        Iterator<Object> it = list1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(list1.isEmpty());
        HashSet<Object> list2 = (HashSet<Object>)list1.clone();
        System.out.println(list2);
        Object[] arr = new Object[list1.size()];
         list1.toArray(arr);
        for(Object str : arr) {
            System.out.println(str);
        }
        HashSet<Object> list3 = new HashSet<>();
        for(Object obj : list1) {
            list3.add(list2.contains(obj) ? "Yes" : "No");
            System.out.println(list3);
        }
        list1.retainAll(list2);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
        list2.remove(null);
        System.out.println(list2);
        if(list2.contains('A')) {
            System.out.println("Found the element"); }
            else {
                System.out.println("Element not found");
            }
        }

    }

