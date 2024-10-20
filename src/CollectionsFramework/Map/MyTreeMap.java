package CollectionsFramework.Map;

import java.util.HashMap;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        //Stores elements in Key,Value pair
        //sorted order

        TreeMap<Integer,String>mpp=new TreeMap<>();

        mpp.put(1,"mani");
        mpp.put(3,"mahi");
        mpp.put(2,"mohan");
        mpp.put(4,"panee");
        mpp.put(5,"pawan");
        System.out.println(mpp);
        System.out.println(mpp.get(3));
        mpp.remove(2);
        System.out.println(mpp);
        System.out.println(mpp.get(100)); //returns the null

        mpp.forEach((key,value)->{
            System.out.println(key+value);
        });
    }
}
