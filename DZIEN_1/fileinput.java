import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:/Temp/dane.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        int bajt = 0;
        try {
            bajt = fis.read();
            while (bajt!=-1){
                System.out.print((char)bajt);
                bajt=fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }

        try {
            fis.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
