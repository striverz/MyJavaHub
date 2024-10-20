package CollectionsFramework.CommonAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonAlgorithms {
    public static void main(String[] args) {

        ArrayList<Integer>al=new ArrayList<>();
        al.add(4);
        al.add(6);
        al.add(9);
        al.add(1);
        al.add(4);
        al.add(2);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);

        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));

        System.out.println(Collections.frequency(al,4));

        int arr[]=new int[4];
        arr[0]=5;
        arr[1]=1;
        arr[2]=6;
        arr[3]=-1;
        for(var num:arr){
            System.out.print(num);
        }
        Arrays.sort(arr);
        System.out.println();
        for(var num:arr){
            System.out.print(num);
        }


    }
}
