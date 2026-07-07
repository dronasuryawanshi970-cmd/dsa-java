import java.util.*;

public class StackLearning {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(2);
        st.push(1);
        st.push(3);
        st.push(4);

        st.pop();
        System.out.println(st.peek());

        System.out.println(st.peek());

        st.pop();

        st.push(5);

        System.out.println(st.peek());

        System.out.println(st);
    }
}