package lesson3a.classes;

import lesson3a.abstraction.Figure;
import lesson3a.abstraction.IncorrectSidesExeption;
import lesson3a.abstraction.Polygon;

public class Rectangle extends Figure implements Polygon {
    private int height;
    private int width;

    public Rectangle(int height, int width) throws IncorrectSidesExeption {
        if (height <= 0 || width <= 0){
            throw new IncorrectSidesExeption("Прямоугольник не может быть создан");
        }
    }

    @Override
    public float area() {
        float area = height * width;
        return area;
    }

    @Override
    public float perimeter() {
        float perimeter = (height + width) * 2;
        return perimeter;
    }
}
