package lab9_b;

import java.io.Serializable;

public class CargoAircraft extends Aircraft implements Serializable {
    private double carryingCapacity; //грузоподъёмность

    public CargoAircraft(String name, double carryingCapacity, int rangeOfFlight, double fuelConsumption) {
        super(name, rangeOfFlight, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString(){
        return "CargoAircraft {name: "+name+", carryingCapacity: "+carryingCapacity+", rangeOfFlight: "+rangeOfFlight+", fuelConsumption: "+fuelConsumption+"};";
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public double getCarryingCapacity() {
        return carryingCapacity;
    }
}