package lesson1;

public class ModelElements {

    public Object creatModel(String name){

        if (name == "Flash"){
            return new Flash();
        }
        if (name == "Camera"){
            return new Camera();
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
