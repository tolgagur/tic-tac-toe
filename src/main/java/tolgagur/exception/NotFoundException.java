package tolgagur.exception;

public class NotFoundException extends Exception{
    private String massage;
    public NotFoundException(String massage){
        this.massage = massage;
    }
    public String getMassage(){
        return massage;
    }
}
