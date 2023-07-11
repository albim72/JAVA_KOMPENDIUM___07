package marcin.com;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> mojSet  = new HashSet<>();
        mojSet.add("abc");
        mojSet.add("abc");
        mojSet.add("xyz");
        mojSet.add("blabla");
        mojSet.add("delta");

        System.out.println(mojSet);

        Set<Integer> numb = new HashSet<>();
        numb.add(65);
        numb.add(8);
        numb.add(11);
        numb.add(57);
        numb.add(6787);
        System.out.println(numb);
    }
}
