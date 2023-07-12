import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(3,6,2,12,77,8,123,888,34,10,0,9,0);
        List<Integer> square = (List) number.stream().map((x)->{
            return x*x;
        }).collect(Collectors.toList());

        System.out.println(number);
        System.out.println(square);

    }
}
