package marcin.com;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<5;i++){
            q.add(i*2);
        }
        System.out.println(q);

        int rem = q.remove();
        System.out.println(rem);

        System.out.println(q);
        int head = q.peek();
        System.out.println(head);
        System.out.println(q);
    }
}
