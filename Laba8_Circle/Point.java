package zhukdi.github.com;

import java.io.*;

public class Point {

    private double x;
    private double y;

    Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }



    public void fileInitialization(){
        File file = new File("point.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            try {
                bufferedWriter.write("3.0");
                bufferedWriter.newLine();
                bufferedWriter.write("4.5");
            } finally {
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }catch (IOException e){
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try (FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()) {
                x = Double.parseDouble(bufferedReader.readLine());
                y = Double.parseDouble(bufferedReader.readLine());
//                System.out.println(bufferedReader.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
