package lesson1;

public interface IModelChanger {
    default void NotifyChanger(IModelChanger sender){}
}
