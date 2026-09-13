package custom_exceptions;

public class Bank {
    public void initiate(){
        ATM atm = new ATM();

        try{
            atm.acceptIntput();
            atm.validate();
        }
        catch (Exception e){
            try{
                atm.acceptIntput();
                atm.validate();
            }
            catch (Exception f){
                try{
                    atm.acceptIntput();
                    atm.validate();
                }
                catch(Exception g){
                    System.out.println("Card blocked");
                }
            }
        }
    }
}
