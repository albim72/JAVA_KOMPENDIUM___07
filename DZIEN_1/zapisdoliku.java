import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] linie = {"Olaf", "Kurek", "Piwne", "188 cm"};
        FileWriter fw = null;

        try {
            fw = new FileWriter("C:/Temp/osoba.txt");

        }catch (FileNotFoundException fn) {
            System.out.println(fn);
        }catch (NullPointerException bn){
            System.out.println(bn);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

        BufferedWriter bw = new BufferedWriter(fw);
        try {
            for(int i=0;i<linie.length; i++){
                bw.write(linie[i]);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("dokonano zapisu do pliku...");
    }
}
