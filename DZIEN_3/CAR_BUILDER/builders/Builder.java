package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;
public interface Builder {
    void setCarType(CarType var1);
    void setSeats(int var1);
    void setEngine(Engine var1);
    void setTransmission(Transmission var1);
    void setCTripComputer(TripComputer var1);
    void setGPSNavigator(GPSNavigator var1);
}
