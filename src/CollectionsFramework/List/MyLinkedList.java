package CollectionsFramework.List;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        //add elements from last as well as from the front
        //getting elements from last as well as from the front

        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.addLast(10);
        ll.addFirst(20);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(2));
        System.out.println(ll.size());
        System.out.println(ll.contains(45));
        System.out.println(ll);


    }
}
