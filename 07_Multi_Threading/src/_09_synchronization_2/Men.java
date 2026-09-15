package _09_synchronization_2;

public class Men extends Thread{
    VotingRoom vr;

    Men(VotingRoom vr){
        this.vr = vr;
    }

    @Override
    public void run(){
        vr.use();
    }
}
