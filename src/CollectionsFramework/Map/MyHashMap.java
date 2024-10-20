package CollectionsFramework.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {

        //Stores elements in Key,Value pair
        //not in sorted order
        HashMap<Integer,String>mpp=new HashMap<>();
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
            System.out.println(key+" -> "+value);
        });








    }
}
