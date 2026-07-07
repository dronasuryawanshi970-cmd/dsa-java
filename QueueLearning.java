import java.util.*;

public class QueueLearning {
    public static void main(String[] args) {

        Queue<Integer> qu = new LinkedList<>();

        qu.offer(2);
        qu.offer(1);
        qu.offer(3);
        qu.offer(4);

        System.out.println(qu.poll());   // removes 2
        System.out.println(qu.peek());   // 1

        System.out.println(qu.poll());   // removes 1
        System.out.println(qu.peek());   // 3

        qu.offer(7);

        System.out.println(qu.peek());   // 3
        System.out.println(qu.size());   // 3

        System.out.println(qu);          // [3, 4, 7]
    }
}