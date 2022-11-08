package lesson3a;

import lesson3a.abstraction.Figure;
import lesson3a.abstraction.IncorrectSidesExeption;
import lesson3a.abstraction.LongCircles;
import lesson3a.abstraction.Polygon;
import lesson3a.classes.Circle;
import lesson3a.classes.Rectangle;
import lesson3a.classes.Square;
import lesson3a.classes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Programe {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        try {
            figures.add(new Circle(10));
        } catch (IncorrectSidesExeption ex) {
            System.err.println("Круг не может быть создан");
        }
        try {
            figures.add(new Rectangle(10,8));
        } catch (IncorrectSidesExeption ex) {
            System.err.println("Прямоугольник не может быть создан");
        }
        try {
            figures.add(new Square(8));
        } catch (IncorrectSidesExeption ex) {
            System.err.println("Квадрат не может быть создан");
        }
        try {
            figures.add(new Triangle(7,5,4));
        } catch (IncorrectSidesExeption ex) {
            System.err.println("Треугольник не может быть создан");
        }

        for (int i = 0; i < figures.size(); i++){
            printFigureInfo(figures.get(i));
        }
    }

    public static void printFigureInfo(Figure figure){
        System.out.println(figure.area());
        if (figure instanceof Polygon){
            System.out.println(((Polygon) figure).perimeter());
        }
        if (figure instanceof LongCircles){
            System.out.println(((LongCircles) figure).longcircles());
        }
    }
}
