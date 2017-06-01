package shapes;

public class Triangle extends Shape{
    private final Point a;
    private final Point b;
    private final Point c;

    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow((b.getX()-a.getX()),2) + Math.pow((b.getY()-a.getY()),2))
                + Math.sqrt(Math.pow((c.getX()-b.getX()),2) + Math.pow((c.getY()-b.getY()),2))
                + Math.sqrt(Math.pow((c.getX()-a.getX()),2) + Math.pow((c.getY()-a.getY()),2));
    }

    @Override
    public double getArea(){
        return Math.abs((a.getX()-c.getX())*(b.getY()-c.getY())
                -(b.getX()-c.getX())*(a.getY()-c.getY()))/2;
    }

    @Override
    public String toString(){
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    private double getLength(Point a, Point b){
        return Math.sqrt(Math.pow((b.getX()-a.getX()),2) + Math.pow((b.getY()-a.getY()),2));
    }

    public boolean isIsisceles(){ //равнобедренный
        double lenA, lenB, lenC;
        lenA = getLength(a, b);
        lenB = getLength(b, c);
        lenC = getLength(c, a);

        return ((lenA == lenB && lenA!=lenC) || (lenA == lenC) && lenA!=lenB || (lenB == lenC) && lenB!=lenA);
    }

    public boolean isEquilateral(){ //равносоторонний
        double lenA, lenB, lenC;
        lenA = getLength(a, b);
        lenB = getLength(b, c);
        lenC = getLength(c, a);

        return lenA == lenB && lenA == lenC && lenB == lenC;
    }

    private double findMaxLength(double lenA, double lenB, double lenC){
        double maxLength = lenA;
        if(maxLength<lenB){
            maxLength = lenB;
            if(maxLength<lenC){
                maxLength = lenC;
            }
        }
        return maxLength;
    }

    public boolean isRectangular(){
        double lenA, lenB, lenC;

        lenA = getLength(a, b);
        lenB = getLength(b, c);
        lenC = getLength(c, a);
        double maxLength = findMaxLength(lenA, lenB, lenC);

        if(lenA == maxLength){
            return lenA == Math.sqrt(Math.pow(lenB,2) + Math.pow(lenC,2));
        }
        else if(lenB == maxLength){
            return lenB == Math.sqrt(Math.pow(lenA,2) + Math.pow(lenC,2));
        }
        else
            return lenC == Math.sqrt(Math.pow(lenA,2) + Math.pow(lenB,2));
    }
}
