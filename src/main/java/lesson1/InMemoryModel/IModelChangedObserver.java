package lesson1.InMemoryModel;

public interface IModelChangedObserver {
    default void ApplyUpdateModel(){}
}
