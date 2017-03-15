package zhukdi.github.com;

public class Circle extends Circumference{
    private Point center;

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
