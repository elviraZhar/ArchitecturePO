package lesson3.abstraction;

public interface Polygon {
    default float perimeter() {
        return 0;
    }
}
