import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        double c;
        List<Double> c1 = new ArrayList<>();
        List<Double> c2 = new ArrayList<>();

        try{
            Scanner sc = new Scanner(new File("input.txt"));
            boolean select = false;
            while(sc.hasNext()){
                c = Double.parseDouble(sc.nextLine());
                if (c < 0) {
                    select = true;
                    continue;
                }
                if (!select) {
                    c1.add(c);
                }else {
                    c2.add(c);
                }
            }
            sc.close();
        }catch(FileNotFoundException e){e.printStackTrace();}

        Collections.sort(c1);
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
        c1.addAll(c2);
        Collections.sort(c1);
        System.out.println("c1:"+c1);
    }
}
