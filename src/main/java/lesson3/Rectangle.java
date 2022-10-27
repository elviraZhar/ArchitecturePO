package lesson3;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width) throws IncorrectSidesExeption{
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
