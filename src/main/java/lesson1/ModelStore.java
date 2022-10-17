package lesson1;

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
        ModelElements modelElements = new ModelElements();

        model.add((PoligonalModel) modelElements.creatModel("PoligonalModel"));
        scenes.add((Scene) modelElements.creatModel("Scene"));
        flashes.add((Flash) modelElements.creatModel("Flash"));
        cameras.add((Camera) modelElements.creatModel("Camera"));
    }
}
