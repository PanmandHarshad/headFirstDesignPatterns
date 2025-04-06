package chapter9.iterator.menu;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
