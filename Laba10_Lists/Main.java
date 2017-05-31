import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> voltageList = new ArrayList<>();
        List<Double> amperageList = new ArrayList<>();

        amperageInitialize(amperageList);
        voltageInitialize(voltageList);

        //show(amperageList);
        //show(voltageList);

        System.out.println("Приближённое сопротивление:" + resistanceCalculation(amperageList, voltageList));

    }

    private static void show(List<Double> list) {
        for (Double aList : list) {
            System.out.println(aList);
        }
    }

    private static double resistanceCalculation(List<Double> alist, List<Double> vlist) {
        double numerator = 0;
        double denominator = 0;

        for (int i = 0; i < alist.size(); i++){
            numerator += alist.get(i)*vlist.get(i);
        }

        for (int i = 0; i < alist.size(); i++) {
            denominator += alist.get(i)*alist.get(i);
        }

        return numerator/denominator;
    }

    private static void amperageInitialize(List<Double> list) {
        list.add(0.1);
        list.add(0.2);
        list.add(0.3);
        list.add(0.4);
        list.add(0.5);
        list.add(0.6);
        list.add(0.7);
        list.add(0.8);
        list.add(0.9);
        list.add(1.0);
    }

    private static void voltageInitialize(List<Double> list) {
        list.add(0.27);
        list.add(0.56);
        list.add(0.9);
        list.add(1.18);
        list.add(1.49);
        list.add(1.79);
        list.add(2.05);
        list.add(2.42);
        list.add(2.68);
        list.add(3.01);
    }
}
