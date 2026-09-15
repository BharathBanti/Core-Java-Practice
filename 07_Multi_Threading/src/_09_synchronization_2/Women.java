package _09_synchronization_2;

public class Women extends Thread{
    VotingRoom vr;

    Women(VotingRoom vr){
        this.vr = vr;
    }

    @Override
    public void run(){
        vr.use();
    }
}
