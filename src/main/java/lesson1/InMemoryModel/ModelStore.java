package lesson1.InMemoryModel;

import lesson1.Factory.CameraFactory;
import lesson1.Factory.FlashFactory;
import lesson1.Factory.PoligonalModelFactory;
import lesson1.Factory.SceneFactory;
import lesson1.ModelElements.*;


import java.util.ArrayList;

public class ModelStore implements IModelChanger {

    private IModelChangedObserver changedObserver;
    public static ArrayList<PoligonalModel> model;
    public static ArrayList<Scene> scenes;
    public static ArrayList<Flash> flashes;
    public static ArrayList<Camera> cameras;


    public Scene getScene(int x) {
        return getScene(x);
    }

    @Override
    public void NotifyChanger(IModelChanger sender) {

    }

    public static void main(String[] args) {
        FlashFactory flashFactory = new FlashFactory();
        CameraFactory cameraFactory = new CameraFactory();
        SceneFactory sceneFactory = new SceneFactory();
        PoligonalModelFactory poligonalModelFactory = new PoligonalModelFactory();

        model.add(poligonalModelFactory.creatModel("PoligonalModel", Poligon[] poligons, Texture[] textures));
        scenes.add(sceneFactory.creatModel("Scene", PoligonalModel[] models, Flash[] flashes));
        flashes.add(flashFactory.creatModel("Flash", Point3D location, Angle3D angle, Color color, float power));
        cameras.add(cameraFactory.creatModel("Camera", Point3D location, Angle3D angle));
    }
}
