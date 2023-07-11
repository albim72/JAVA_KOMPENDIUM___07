package marcin.com;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("To jest pierwszy program z użyciem Maven");
        List<Integer> l1 = new ArrayList<>();
        l1.add(0,1);
        l1.add(1,231);
        l1.add(122);
        l1.add(1,78);
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(45);
        l2.add(13);
        l2.add(114);

        l1.addAll(1,l2);
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);

        System.out.println(l1.get(3));
        l1.set(0,44);
        System.out.println(l1);

        int index = l1.indexOf(231);
        System.out.println("indeks elementu 4: " + index);
        int lastIndex = l1.lastIndexOf(44);
        System.out.println(lastIndex);
    }
}
