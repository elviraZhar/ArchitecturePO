package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Programe {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        try {
            figures.add(new Circle(0));
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
           System.out.println(perimeterFigure(figures.get(i)));
        }

        for (int i = 0; i < figures.size(); i++){
            System.out.println(areaFigure(figures.get(i)));
        }
    }

    public static float perimeterFigure(Figure figure){
        float per;
        per = figure.perimeter();
        return per;
    }

    public static float areaFigure(Figure figure){
        float ar;
        ar = figure.area();
        return ar;
    }
}
