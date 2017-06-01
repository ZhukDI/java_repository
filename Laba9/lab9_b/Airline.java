package lab9_b;

import java.util.ArrayList;
import java.util.Collections;

public class Airline{
    private String name;
    private ArrayList<Aircraft> aircraftList;

    public Airline(String name, ArrayList<Aircraft> arrayList) {
        this.name = name;
        this.aircraftList = arrayList;
    }

    public String getName() {
        return name;
    }

    public void showAircraftList(){
        for(Aircraft aircraft: aircraftList){
            System.out.println(aircraft);
        }
    }

    public void sortByRangeOfFlight(){
        aircraftList.sort(Collections.reverseOrder());
    }

    public void searchByFuelConsumptionRange(double min, double max){
        for(Aircraft aircraft: aircraftList){
            if(aircraft.getFuelConsumption()>=min && aircraft.getFuelConsumption()<=max) {
                System.out.println(aircraft);
            }
        }
    }

    public int getTotalCapacity(){
        int total = 0;
        for(Aircraft aircraft: aircraftList){
            total +=aircraft.getCapacity();
        }
        return total;
    }

    public double getTotalCarryingCapacity(){
        double total = 0;
        for(Aircraft aircraft: aircraftList){
            total +=aircraft.getCarryingCapacity();
        }
        return total;
    }
}
