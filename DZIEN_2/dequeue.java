package marcin.com;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();
        deq.addFirst(24);
        deq.add(567);
        deq.addLast(234);
        System.out.println(deq);

        int lewy = deq.removeFirst();
        int prawy = deq.removeLast();
        System.out.println("pierwszy element: " + lewy + ", ostatni elemenet: " +prawy);
        System.out.println(deq);
    }
}
