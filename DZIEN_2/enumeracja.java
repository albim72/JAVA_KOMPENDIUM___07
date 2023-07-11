enum Color {
    RED,GREEN,YELLOW
}

enum Day {
    PON,WT,SR,CZW,PT,SOB,NDZ,ERROR
}


public class Main {
    Day day;

    public Main(Day day) {
        this.day = day;
    }

    public void dobrydzien(){
        switch (day){
            case PON:
                System.out.println("Poniedziałek i po weekendzie...");
                break;
            case WT:
                System.out.println("Wtorek...");
                break;
            case SR:
                System.out.println("Środa, środek tygodnia!");
                break;
            case CZW:
                System.out.println("Czwartek pełen pracy");
                break;
            case PT:
                System.out.println("Piątek i blisko wolnego...");
                break;
            case SOB:
                System.out.println("Sobota, odpoczynek");
                break;
            case NDZ:
                System.out.println("Niedziela na łonie przyrody...");
                break;
            default:
                System.out.println("taki dzień nie istnieje!");
                break;

        }
    }

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);

        String dayofweek = "CZW";
        Main m1 = new Main(Day.valueOf(dayofweek));
        m1.dobrydzien();

        Color koltab[] = Color.values();
        for (Color col:koltab)
        {
            System.out.println(col + " przy indeksie " + col.ordinal());
        }
    }
}
