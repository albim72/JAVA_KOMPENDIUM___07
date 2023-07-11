import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            String a = null;
            System.out.println(a.charAt(0));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("ciąg dalszy programu!");
        System.out.println("_________________________________________");


        try {
            String a = "to jest bardzo ważny i specjalny tekst, który poddamy analizie.....";
            char c = a.charAt(80);
            System.out.println(c);
        }catch (StringIndexOutOfBoundsException w){
            System.out.println(w.getMessage());
        }
        System.out.println("_________________________________________");

        try {
            File file = new File("C://Temp//takie200");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            int r = 0;
            System.out.println(12/r);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
