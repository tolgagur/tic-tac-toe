package tolgagur.exception;

public class InvalidGameException extends Exception{
    private String massage;
    public InvalidGameException(String massage){
        this.massage = massage;
    }
    public String getMassage(){
        return massage;
    }
}
