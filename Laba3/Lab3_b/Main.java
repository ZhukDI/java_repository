package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Админ on 01.03.2017.
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(new Point(0,0), new Point(1,0), new Point(0,1)); //равнобедренный, прямоугольный
        Triangle triangle2 = new Triangle(new Point(1,1), new Point(1,4), new Point(3,1)); //равнобедренный
        Triangle triangle3 = new Triangle(new Point(-5,0), new Point(5,0), new Point(0,9));//равнобедренный
        Triangle triangle4 = new Triangle(new Point(0,0), new Point(3,0), new Point(1.5,3*Math.sqrt(3)/2));//равносторонний

        List<Triangle> isiscelesList = new ArrayList<>();
        List<Triangle> equilateralList = new ArrayList<>();
        List<Triangle> rectangularList = new ArrayList<>();
        List<Triangle> arbitraryList = new ArrayList<>();


        //Shape[] shapes = {triangle1, triangle2};
        Triangle[] triangles = {triangle1, triangle2, triangle3, triangle4};
        printArrayElements(triangles);
        //printArrayElements(shapes);



        for(Triangle triangle: triangles){
            if(triangle.isEquilateral()){
                equilateralList.add(triangle);
            }
            if(triangle.isIsisceles()){
                isiscelesList.add(triangle);
            }
            if(triangle.isRectangular()){
                rectangularList.add(triangle);
            }

            if(!(triangle.isEquilateral() || triangle.isIsisceles() || triangle.isRectangular())){
                arbitraryList.add(triangle);
            }
        }

        System.out.println("Равносторонние треугольники:");
        printListElements(equilateralList);

        System.out.println("Равнобедренные треугольники:");
        printListElements(isiscelesList);

        System.out.println("Прямоугольные треугольники:");
        printListElements(rectangularList);

        System.out.println("Произвольные треугольники:");
        printListElements(arbitraryList);

        Triangle maxPerimeterTriangle = findTriangleWithMaxPerimeter(equilateralList);
        System.out.println("Равносторонний треугольник с максимальным периметром: " + maxPerimeterTriangle);

        Triangle maxAreaTriangle = findTriangleWithMaxArea(equilateralList);
        System.out.println("Равносторонний треугольник с максимальной площадью: " + maxAreaTriangle);

        maxPerimeterTriangle = findTriangleWithMaxPerimeter(isiscelesList);
        System.out.println("Равнобедренный треугольник с максимальным периметром: " + maxPerimeterTriangle);

        maxAreaTriangle = findTriangleWithMaxArea(isiscelesList);
        System.out.println("Равнобедренный треугольник с максимальной площадью: " + maxAreaTriangle);

        maxPerimeterTriangle = findTriangleWithMaxPerimeter(rectangularList);
        System.out.println("Прямоугольный треугольник с максимальным периметром: " + maxPerimeterTriangle);

        maxAreaTriangle = findTriangleWithMaxArea(rectangularList);
        System.out.println("Прямоугольный треугольник с максимальной площадью: " + maxAreaTriangle);
    }

    private static void printListElements(List<Triangle> triangleList){
        for (Triangle triangle: triangleList){
            System.out.println(triangle);
        }
    }

    private static Triangle findTriangleWithMaxPerimeter(List<Triangle> triangleList){
        Triangle maxTriangle = null;
        double maxPerimeter = Double.NEGATIVE_INFINITY;
        for(Triangle triangle: triangleList){
            double perimeter = triangle.getPerimeter();
            if(perimeter > maxPerimeter){
                maxPerimeter = perimeter;
                maxTriangle = triangle;
            }
        }
        return maxTriangle;
    }

    private static Triangle findTriangleWithMaxArea(List<Triangle> triangleList){
        Triangle maxTriangle = null;
        double maxArea = Double.NEGATIVE_INFINITY;
        for(Triangle triangle: triangleList){
            double area = triangle.getArea();
            if(area > maxArea){
                maxArea = area;
                maxTriangle = triangle;
            }
        }
        return maxTriangle;
    }

    private static void printArrayElements(Object[] objects){
        for(int i = 0; i < objects.length; i++){
            System.out.println(i + ": " + objects[i]);
        }
    }

//    private static Shape findShapeWithMaxPerimeter(Shape[] shapes){
//        Shape maxShape = null;
//        double maxPerimeter = Double.NEGATIVE_INFINITY;
//        for(Shape shape: shapes){
//            double area = shape.getPerimeter();
//            if(area > maxPerimeter){
//                maxPerimeter = area;
//                maxShape = shape;
//            }
//        }
//        return maxShape;
//    }
//
//    private static Shape findShapeWithMaxArea(Shape[] shapes){
//        Shape maxShape = null;
//        double maxArea = Double.NEGATIVE_INFINITY;
//        for(Shape shape: shapes){
//            double area = shape.getArea();
//            if(area > maxArea){
//                maxArea = area;
//                maxShape = shape;
//            }
//        }
//        return maxShape;
//    }
}
