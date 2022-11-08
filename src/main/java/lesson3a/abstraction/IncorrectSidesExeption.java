package lesson3a.abstraction;

public class IncorrectSidesExeption extends Exception {
    private String msg;
    public IncorrectSidesExeption(String msg){
        super(msg);
    }
    public String getMsg(){
        return msg;
    }
}
