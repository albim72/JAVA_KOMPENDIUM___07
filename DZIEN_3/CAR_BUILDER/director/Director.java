package director;

import builders.Builder;
import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;
public class Director {
    public Director() {
    }
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.8,0.0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setCTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.2,0.0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setCTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setSeats(5);
        builder.setEngine(new Engine(2.3,0.0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setCTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
