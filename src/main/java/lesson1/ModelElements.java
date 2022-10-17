package lesson1;

import javafx.geometry.Point3D;

import java.awt.*;

public class ModelElements implements Functional{

    public Object creatModel(String name){

        if (name == "Flash"){
            return new Flash(Point3D, Angle3D, Color, float);
        }
        if (name == "Camera"){
            return new Camera(Point3D, Angle3D);
        }
        return null;
    }

    @Override
    public void rotate(Angle3D a) {

    }

    @Override
    public void move(Point3D p) {

    }
}
