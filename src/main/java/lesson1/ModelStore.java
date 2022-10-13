package lesson1;

public class ModelStore implements IModelChanger, IModelChangedObserver {
    private PoligonalModel model;
    private Scene scenes;
    private Flash flashea;
    private Camera cameras;
    private IModelChangedObserver changedObserver;

    public Scene getScene(int x){
        return scenes;
    }

    @Override
    public void NotifyChanger(IModelChanger sender) {

    }

    @Override
    public void ApplyUpdateModel() {

    }
}
