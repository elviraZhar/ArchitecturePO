package lesson3;

import lesson3.abstraction.Figure;
import lesson3.abstraction.IncorrectSidesExeption;
import lesson3.abstraction.Polygon;
import lesson3.abstraction.Сircumference;
import lesson3.classes.Circle;
import lesson3.classes.Rectangle;
import lesson3.classes.Square;
import lesson3.classes.Triangle;

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
        if (figure instanceof Сircumference){
            System.out.println(((Сircumference) figure).circumference());
        }
    }
}
