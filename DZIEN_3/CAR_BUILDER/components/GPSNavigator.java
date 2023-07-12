package components;

public class GPSNavigator {
    private String route;
    public GPSNavigator(){this.route ="ul. Złota 4/5, Kraków";}
    public GPSNavigator(String manualRoute){this.route = manualRoute;}

    public String getRoute() {
        return route;
    }
}
