package CollectionsFramework.List;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<Integer>aList=new ArrayList<>();
        aList.add(10);
        aList.add(20);
        aList.add(15);
        aList.add(5);
        aList.add(30);
        aList.add(0,1);
        aList.removeLast();

        System.out.println(aList);
        System.out.println(aList.size());;
        System.out.println(aList.get(2)); //index
        System.out.println(aList.remove(0)); //index - removes and gives
        System.out.println(aList);
        System.out.println(aList.contains(20));
        System.out.println(aList.contains(100));



    }
}
