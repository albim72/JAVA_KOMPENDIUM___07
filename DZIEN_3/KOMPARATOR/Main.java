import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(111,"Zenobiusz","ul.Złota 5, Kraków"));
        ar.add(new Student(222,"Zyta","ul.Złota 15, Wrocław"));
        ar.add(new Student(888,"Olga","ul.Złota 25, Kraków"));
        ar.add(new Student(444,"Jan","ul.Złota 23, Lublin"));
        ar.add(new Student(333,"Maria","ul.Złota 4, Gdańsk"));

        System.out.println("elementy nieposortowane:");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        System.out.println("__________________________________________");

        Collections.sort(ar,new SortByRoll());
        System.out.println("Sortowanie po nr albumu:");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        System.out.println("__________________________________________");

        Collections.sort(ar,new SortByName());
        System.out.println("Sortowanie po imieniu:");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
