package chapter7.adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationAdapterTest {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        Enumeration<String> enumeration = vector.elements();
        Iterator<String> iterator = new EnumerationIterator<>(enumeration);

        System.out.println("Iterating using EnumerationIterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
