
public class Main {
    public static void main(String[] args) {
        Users usr = new Users();
        System.out.println(usr.info());

        System.out.printf("Rok: %d\n",IEkstra.rok);
        usr.opis(2300,0.88);
        System.out.printf(usr.user("Jan","Kot"));
        usr.sekcja();
    }
}
