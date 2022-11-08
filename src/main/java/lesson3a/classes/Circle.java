package lesson3a.classes;

import lesson3a.abstraction.Figure;
import lesson3a.abstraction.IncorrectSidesExeption;
import lesson3a.abstraction.LongCircles;

public class Circle extends Figure implements LongCircles {
    private int radius;

    public Circle(int radius) throws IncorrectSidesExeption {
        if (radius <= 0){
            throw new IncorrectSidesExeption("Круг не может быть создан");
        }
    }

    @Override
    public float area() {
        float area = (float) (3.14 * radius * radius);
        return area;
    }

    @Override
    public float longcircles() {
        float perimeter = (float) (2 * 3.14 * radius);
        return perimeter;
    }
}
