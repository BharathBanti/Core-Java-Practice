package _09_synchronization_2;

public class VotingRoom {
    synchronized public void use(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " has entered into voting room");
        for(int i = 1; i <= 3; i++){
            System.out.println(name + " is voting...");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(name + " has exited from voting room");
    }
}
