package EX2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class asd {
    public static void main(String[] args){
        Collection collection = new ArrayList();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString().toUpperCase() + " ");
        }
        System.out.println();
    }
}
