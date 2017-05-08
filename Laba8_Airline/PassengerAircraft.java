package zhukdi_Airline.github.com;

public class PassengerAircraft extends Aircraft{
    private int capacity; //количество пассажиров

    public PassengerAircraft(String name, int capacity, int rangeOfFlight, double fuelConsumption) {
        super(name, rangeOfFlight, fuelConsumption);
        this.capacity = capacity;
    }

    @Override
    public String toString(){
        return "PassengerAircraft {name: "+name+", capacity: "+capacity+", rangeOfFlight: "+rangeOfFlight+", fuelConsumption: "+fuelConsumption+"};";
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public double getCarryingCapacity() {
        return 0;
    }
}
