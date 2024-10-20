package CollectionsFramework.Set;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {

        //DS which stores unique elements in random order

        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(0);
        System.out.println(hs);
        hs.remove(2); //removing the element


        for(Integer num:hs){
            System.out.println(num);
        }

        //iterating without specifying the type of data
        for(var num:hs){
            System.out.println(num);
        }

    }

}
