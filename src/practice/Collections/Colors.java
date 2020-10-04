package practice.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Colors {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("White");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Pink");
        System.out.println("Using for loop colors are :");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("Using foreach loop : ");
        for (String var : colors) {
            System.out.println(var);
        }
        System.out.println("Using Iterator :");
        Iterator obj = colors.iterator();
        while (obj.hasNext()) {
            System.out.println(obj.next());
        }
        System.out.println("Using ListIterator :");
        ListIterator<String> listObj = colors.listIterator();
        while(listObj.hasNext()) {
            System.out.println(listObj.next());
        }
    }
}
