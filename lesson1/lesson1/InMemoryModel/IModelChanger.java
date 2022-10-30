package lesson1.InMemoryModel;

public interface IModelChanger {
    default void NotifyChanger(IModelChanger sender){}
}
