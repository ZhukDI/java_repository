package zhukdi.github.com;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0.0, 0.0), 4);

        Point point = new Point(2.0,2.0);

        System.out.println(circle);
        System.out.println(isBelong(circle.getCenter(), point, circle.getRadius()));

        circle.setRadius(1.5);
        System.out.println(circle);
        System.out.println(isBelong(circle.getCenter(), point, circle.getRadius()));

        System.out.print("Длина окружности: ");
        System.out.println(circle.getCircumference(circle.radius));
    }

    /**
     * Определение принадлежности точки данному кругу.
     * Возвращает true если точка принадлежит кругу.
     */
    private static boolean isBelong(Point center, Point point, double radius){
        double length = Math.sqrt(Math.pow((center.getX()-point.getX()),2) + Math.pow((center.getY()-point.getY()),2));
        return radius>=length;
    }
}
