package lesson1;

public class ModelStore implements IModelChanger {
    public PoligonalModel model;
    public Scene scenes;
    public Flash flashea;
    public Camera cameras;
    private IModelChangedObserver changedObserver;

    public Scene getScene(int x){
        return scenes;
    }

    @Override
    public void NotifyChanger(IModelChanger sender) {

    }

}
