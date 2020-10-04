package practice.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        TreeSet<String> color = new TreeSet<>();
        color.add("Red");
        color.add("Yellow");
        color.add("Green");
        color.add("Blue");
        System.out.println("TreeSet : " + color);

        Iterator<String> it = color.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        TreeSet<String> color2 = new TreeSet<>();
        color2.addAll(color);
        System.out.println(color2);
        System.out.println(color);

        Iterator<String> ite = color.descendingIterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }

        System.out.println("First element is " + color.first());
        System.out.println("Last element is " + color.last());

        TreeSet<String> color3 = (TreeSet<String>)color.clone();
        System.out.println(color3);
        System.out.println("Number of elements are " + color.size());

        TreeSet<String> color4 = new TreeSet<>();
        for(String str : color) {
            color4.add(color3.contains(str)? "yes" : "no");
            System.out.println(color4);
        }

        System.out.println(color.headSet("Red"));
        System.out.println(color.tailSet("Green"));

        TreeSet<Integer> num = new TreeSet<>();
        num.add(12);
        num.add(23);
        num.add(76);
        num.add(10);
        num.add(3);
        System.out.println(num.headSet(20));
        System.out.println(num.tailSet(11));
        System.out.println("Greater than 20 is : " + num.higher(20));
        System.out.println("Number lesser than 15 is : " + num.lower(15));
        System.out.println("Number greater than or equal to 12 is : " + num.ceiling(12));




    }
}
