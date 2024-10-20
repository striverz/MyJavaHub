package CollectionsFramework.Queue;

import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {

        //stores elements
        //and when ever we ask for elements it gives us the smallest element
        //the elements are stored in tree fashing so we dont see the structure
        //but it gives the smallest element

        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(0);
        pq.offer(5);
        pq.offer(-4);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }


    }
}
