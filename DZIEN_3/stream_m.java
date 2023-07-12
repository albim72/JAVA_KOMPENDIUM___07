import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(3,6,2,12,77,8,123,888,34,10,0,9,0);
        List<Integer> square = (List) number.stream().map((x)->{
            return x*x;
        }).collect(Collectors.toList());

        System.out.println(number);
        System.out.println(square);

        List<String> names = Arrays.asList("Strumień","Serializacja","Kolekcja","Refleksja");
        List<String> wynik = (List)names.stream().filter((s) -> {
            return s.startsWith("S");
        }).collect(Collectors.toList());

        System.out.println(names);
        wynik.forEach(System.out::println);

        List<String> show = (List)names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);


        List<String> sortshow = (List)names.stream().sorted().filter((s)->{
            return s.startsWith("S");
        }).collect(Collectors.toList());
        System.out.println(sortshow);

        Set<Integer> cubeset = (Set)number.stream().map((x)->{
            return x*x*x;
        }).collect(Collectors.toSet());

        System.out.println(cubeset);

        number.stream().filter((x)->{
            return x%2==0;
        }).forEach((y)-> System.out.println(y));

        int ev = (Integer)number.stream().filter((x)->{
            return x%2==0;
        }).reduce(0,(ans,i)->{
            return ans+i;
        });
        System.out.println(ev);

    }
}
