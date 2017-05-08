package zhukdi_Airline.github.com;

public abstract class Aircraft implements Comparable<Aircraft>{
    String name;
    int rangeOfFlight; //дальность полёта
    double fuelConsumption; //расход топлива в г/пасс-км. (33, 20.9, 25.5)

    public Aircraft(String name, int rangeOfFlight, double fuelConsumption) {
        this.name = name;
        this.rangeOfFlight = rangeOfFlight;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRangeOfFlight(int rangeOfFlight) throws AircraftLogicException {
        if(rangeOfFlight < 0){
            throw new AircraftLogicException("rangeOfFlight is incorrect");
        }
        this.rangeOfFlight = rangeOfFlight;
    }

    public void setFuelConsumption(double fuelConsumption) throws AircraftLogicException {
        if(fuelConsumption < 0){
            throw  new AircraftLogicException("fuelConsumption is incorrect");
        }
        this.fuelConsumption = fuelConsumption;
    }

    public abstract int getCapacity();

    public abstract double getCarryingCapacity();

    @Override
    public int compareTo(Aircraft a) {
        return a.rangeOfFlight - this.rangeOfFlight;
    }
}
