package CollectionsFramework.List;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        //LIFO -Last in First out
        //push,peek,pop,size,isEmpty

        Stack<Integer> st=new Stack<>();
        st.push(3);
        st.push(4);
        st.push(2);
        st.push(1);
        st.push(2);

        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
