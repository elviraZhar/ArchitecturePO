package lesson1;

public interface IModelChanger {
    public default void NotifyChanger(IModelChanger sender){}
}
