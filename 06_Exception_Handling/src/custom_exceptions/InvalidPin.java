package custom_exceptions;

public class InvalidPin extends Exception{
    @Override
    public String getMessage(){
        return "Invalid Pin";
    }
}
