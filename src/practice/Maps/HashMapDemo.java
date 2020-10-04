package practice.Maps;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        students.put("John", 1);
        students.put("Alex", 2);
        students.put("Shirley", 3);
        students.put("Jessica", 4);

        System.out.println(students);
        System.out.println(students.isEmpty());
        System.out.println(students.size());
        System.out.println(students.containsKey("Alex"));
        System.out.println(students.containsValue(5));
        System.out.println(students.entrySet());
        System.out.println(students.replace("Alex", 7));
        System.out.println(students);
        System.out.println(students.remove("Jessica"));
        System.out.println(students);
        System.out.println(students.toString());
        System.out.println("Foreach loop : ");
        for(Map.Entry obj : students.entrySet()) {
            System.out.println("Key : " + obj.getKey() + " &  Value : " + obj.getValue());
        }
        System.out.println("Using Iterator : ");
        Iterator it = students.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry obj2 = (Map.Entry) it.next();
            System.out.println("Key : " + obj2.getKey() +" & Value : " + obj2.getValue() );
        }
    }
}
