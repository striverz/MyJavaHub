package CollectionsFramework.Set;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {

        //DS which stores the unique elements in sorted order fashion
        TreeSet<Integer>ts=new TreeSet<>();

        ts.add(12);
        ts.add(4);
        ts.add(9);
        ts.add(1);
        ts.add(3);
        System.out.println(ts);
        ts.remove(3); //removes the element
        System.out.println(ts);

        System.out.println(ts.floor(8)); //<=8
        System.out.println(ts.ceiling(8)); //>=8



    }
}
