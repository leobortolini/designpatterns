package application.builders;

import application.cars.CarType;
import application.components.Engine;
import application.components.GPSNavigator;
import application.components.Transmission;
import application.components.TripComputer;

public interface Builder {

	void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
