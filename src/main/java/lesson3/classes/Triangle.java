package lesson3.classes;

import lesson3.abstraction.Figure;
import lesson3.abstraction.IncorrectSidesExeption;
import lesson3.abstraction.Polygon;

import static java.lang.Math.sqrt;

public class Triangle extends Figure implements Polygon{
    private int a;
    private int b;
    private int c;

     public Triangle(int a, int b, int c) throws IncorrectSidesExeption {
        if (a+b <= c || b+c <= a || a+c <= b){
            throw new IncorrectSidesExeption("Треугольник не может быть создан");
        }
    }

    @Override
    public float area() {
        float p = (a + b + c)/2;
        float area = (float) sqrt(p * (p-a) * (p-b) * (p-c));
        return area;
    }

    @Override
    public float perimeter() {
        int perimeter = a + b + c;
        return perimeter;
    }

}
