package tolgagur.exception;

public class InvalidParamException extends Exception{

    private String massage;
    public InvalidParamException(String massage){
        this.massage = massage;
    }
    public String getMassage(){
        return massage;
    }
}
