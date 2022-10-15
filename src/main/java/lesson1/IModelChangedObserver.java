package lesson1;

public interface IModelChangedObserver {
    default void ApplyUpdateModel(){}
}
