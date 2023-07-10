public class Main {
    public static void main(String[] args) {

        int[] tablica = new int[10];

        for (int i=0;i<10;i++){
            tablica[i] = 2*i+1;
        }

        int trzeci = tablica[3];
        System.out.println("wybrany (3) element to: " + trzeci);

        System.out.println("_______________________________________________");
        for (int i=0;i<10;i++)
            System.out.println(i + " element:" + tablica[i]);
        }

    }
