package lesson1.Factory;

import lesson1.ModelElements.Poligon;
import lesson1.ModelElements.PoligonalModel;
import lesson1.ModelElements.Texture;

public class PoligonalModelFactory {
    public PoligonalModel creatModel(String name, Poligon[] poligons, Texture[] textures){
        return new PoligonalModel();
    }
}
