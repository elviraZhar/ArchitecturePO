package lesson3a.classes;

import lesson3a.abstraction.Figure;
import lesson3a.abstraction.IncorrectSidesExeption;
import lesson3a.abstraction.Polygon;

public class Square extends Figure implements Polygon {
    private int side;

    public Square(int side) throws IncorrectSidesExeption {
        if (side <= 0){
            throw new IncorrectSidesExeption("Квадрат не может быть создан");
        }
    }

    @Override
    public float area() {
        float area = side * side;
        return area;
    }

    @Override
    public float perimeter() {
        float perimeter = side * 4;
        return perimeter;
    }
}
