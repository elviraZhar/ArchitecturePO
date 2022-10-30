package lesson1.Factory;

import lesson1.ModelElements.Flash;
import lesson1.ModelElements.PoligonalModel;
import lesson1.ModelElements.Scene;

public class SceneFactory extends ModelFactory{
    public Scene creatModel(String name, PoligonalModel[] models, Flash[] flashes){
        return new Scene();
    }
}
