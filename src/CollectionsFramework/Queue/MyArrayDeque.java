package CollectionsFramework.Queue;

import java.util.ArrayDeque;

public class MyArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>ad=new ArrayDeque<>();
        ad.offer(12);
        ad.offer(9);
        ad.offer(4);
        ad.offer(1);
        System.out.println(ad);
        System.out.println(ad.peek());
        ad.poll();
        System.out.println(ad);

        while(!ad.isEmpty()){
            System.out.println(ad.peek());
            ad.poll();
        }



    }
}
