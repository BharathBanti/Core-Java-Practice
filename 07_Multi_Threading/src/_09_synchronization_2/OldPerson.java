package _09_synchronization_2;

public class OldPerson extends Thread{
    VotingRoom vr;

    OldPerson(VotingRoom vr){
        this.vr = vr;
    }

    @Override
    public void run(){
        vr.use();
    }
}
