package lesson1;

public interface IModelChangedObserver {
    public default void ApplyUpdateModel(){}
}
