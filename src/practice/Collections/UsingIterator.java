package practice.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class UsingIterator {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(12);
        list1.add(23);
        list1.add(87);
        list1.add(3);
        list1.add(10);

        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()) {
            Integer num = it.next();
            if(num % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(list1);

        System.out.println(list1.contains(3));
    }
}
