package practice.Maps;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class SortingDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("Rahul", 123);
        employees.put("Roy", 456);
        employees.put("Rony", 789);
        employees.put("Raku", 112);

        System.out.println("Before sorting :" + employees);

        Set set = employees.entrySet();
        Iterator it = employees.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry obj = (Map.Entry) it.next();
           // System.out.println("Key : " + obj.getKey() + " & Value : " + obj.getValue());

            Map<String, Integer> mapObj = new TreeMap<String, Integer> (employees);
            System.out.println("After sorting :"+ mapObj);
            Set set2 = mapObj.entrySet();
            Iterator it2 = set2.iterator();
            while(it2.hasNext()) {
                Map.Entry obj2 = (Map.Entry) it2.next();
               // System.out.println("Key : " + obj2.getKey() + " & Value : " + obj2.getValue());
            }
        }
    }
}
