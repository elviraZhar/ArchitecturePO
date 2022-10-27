package lesson3;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) throws IncorrectSidesExeption{
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
    public float perimeter() {
        float perimeter = (float) (2 * 3.14 * radius);
        return perimeter;
    }

}
