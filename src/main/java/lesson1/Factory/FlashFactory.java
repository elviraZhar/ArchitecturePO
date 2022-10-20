package lesson1.Factory;

import javafx.geometry.Point3D;
import lesson1.ModelElements.Flash;

import java.awt.*;

public class FlashFactory extends ModelFactory {
    public Flash creatModel(String name, Point3D location, Angle3D angle, Color color, float power){
        return new Flash();
    }
}
