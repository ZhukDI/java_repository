package zhukdi.github.com;

import java.io.*;

public class Circle extends Circumference{
    private Point center;

    public Circle() {
        center = new Point();
    }

    public Circle(Point center) {

        this.center = center;
    }

    public Circle(Point center, double radius) {
        super(radius);
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }


    public double getArea(){
        return radius * radius * Math.PI;
    }

    public void fileInitialization(){
        center.fileInitialization();
        File file = new File("circle.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            try {
                bufferedWriter.write("5.0");
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
                radius = Double.parseDouble(bufferedReader.readLine());
                //System.out.println(bufferedReader.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        return center.hashCode();
    }

    @Override
    public String toString(){
        return "Circle{" + "center = " + center + ", radius = " + radius + "}";
    }


}
