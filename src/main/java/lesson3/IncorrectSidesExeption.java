package lesson3;

public class IncorrectSidesExeption extends Exception{
    private String msg;
    public IncorrectSidesExeption(String msg){
        super(msg);
    }
    public String getMsg(){
        return msg;
    }
}
