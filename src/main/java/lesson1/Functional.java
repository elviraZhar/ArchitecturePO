package lesson1;

import javafx.geometry.Point3D;

public interface Functional {
    default void rotate(Angle3D a){
    }

    default void move(Point3D p){
    }
}
