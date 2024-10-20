package CollectionsFramework.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(3);
        al.add(5);
        al.add(9);
        System.out.println(al);

        //normal way of doing
        for(var num : al){
            System.out.print(num);
        }
        System.out.println();

        Iterator<Integer>it=al.iterator();
        while(it.hasNext()){
            Integer num=it.next();
            System.out.print(num);
        }
    }
}
