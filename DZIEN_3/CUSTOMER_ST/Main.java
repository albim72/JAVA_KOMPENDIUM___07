import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Adam","Nowak","Wrocław",1970));
        customers.add(new Customer("Ada","Kot","Kraków",1975));
        customers.add(new Customer("Leon","Kos","Wrocław",1967));
        customers.add(new Customer("Maria","Kowal","Lublin",1999));
        customers.add(new Customer("Nadia","Pyk","Wrocław",2003));
        customers.add(new Customer("Olaf","Gnom","Gdańsk",1950));

        List<String> names = customers.stream()
                .filter(c->c.getCity().equals("Wrocław"))
                .map(c->c.getFirstName().toUpperCase() + " " + c.getLastName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
