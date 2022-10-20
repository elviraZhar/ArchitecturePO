package lesson1.Factory;

import javafx.geometry.Point3D;
import lesson1.ModelElements.Camera;

public class CameraFactory extends ModelFactory {
    public Camera creatModel(String name, Point3D location, Angle3D angle){
        return new Camera();
    }
}
