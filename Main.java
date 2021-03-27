package lesson4.homeWork;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> mll = new MyLinkedList<>();
        mll.insertLast(100);
        mll.insertLast(200);
        mll.insertLast(300);

        System.out.println("Iterator");
        Iterator<Integer> iter = mll.iterator();
        System.out.println(iter.hasNext());

        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();
        System.out.println("-----------------");
        System.out.println("ListIterator");
        ListIterator<Integer> listiter = mll.listiterator();
        System.out.println(listiter.hasNext());

        System.out.println(mll);
        System.out.println(listiter.next());
        System.out.println(listiter.next());
        System.out.println(listiter.nextIndex());
        System.out.println(listiter.previousIndex());

        System.out.println(listiter.hasPrevious());
        System.out.println(listiter.previous());
        listiter.remove();

        listiter.add(3000);
        System.out.println(listiter.next());
        listiter.set(1000);
        System.out.println(mll);
    }

}

