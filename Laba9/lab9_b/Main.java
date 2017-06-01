package lab9_b;

import java.util.ArrayList;
import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aircraft> aircraftList = new ArrayList<>();

        PassengerAircraft aircraft1 = new PassengerAircraft("airbus A310", 280, 6800, 20);
        PassengerAircraft aircraft2 = new PassengerAircraft("boeing 747", 524, 14200, 33);

        CargoAircraft aircraft3 = new CargoAircraft("boeing 757", 39, 4670, 40);
        CargoAircraft aircraft4 = new CargoAircraft("DC 8", 45, 8950, 42);

        aircraftList.add(aircraft1);
        aircraftList.add(aircraft2);
        aircraftList.add(aircraft3);
        aircraftList.add(aircraft4);

        Airline airline = new Airline("Dmitry-airline", aircraftList);
        System.out.println("Список самолётов авиакомпании " + airline.getName() + ":");
        airline.showAircraftList();
        airline.sortByRangeOfFlight();
        System.out.println("Список отсортированный по дальности полёта: ");
        airline.showAircraftList();
        System.out.println("Самолёты соответствующие заданному диапазону потребления горючего:");
        airline.searchByFuelConsumptionRange(20, 33.5);

        System.out.print("Общая вместимость: ");
        System.out.println(airline.getTotalCapacity());
        System.out.print("Общая грузоподъёмность: ");
        System.out.println(airline.getTotalCarryingCapacity());

        String file = "src/test/text.txt";
        Serializator sz = new Serializator();
        boolean b = sz.serialization(aircraft1, file);
        // чтение и вывод объекта
        Aircraft res = null;
        try {
            res = sz.deserialization(file);
        } catch (InvalidObjectException e) {
            // обработка
            e.printStackTrace();
        }
        System.out.println("Серриализация!");
        System.out.println(res);
    }
}