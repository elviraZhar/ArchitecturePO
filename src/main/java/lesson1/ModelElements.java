package lesson1;

import javafx.geometry.Point3D;

import java.awt.*;

public class ModelElements {

    public Object creatModel(String name){

        if (name == "Flash"){
            return new Flash(Point3D, Angle3D, Color, float);
        }
        if (name == "Camera"){
            return new Camera(Point3D, Angle3D);
        }
        if (name == "PoligonalModel"){
            return new PoligonalModel();
        }
        if (name == "Scene"){
            return new Scene();
        }
        return null;
    }

}
