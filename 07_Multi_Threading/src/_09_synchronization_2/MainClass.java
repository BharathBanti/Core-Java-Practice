package _09_synchronization_2;

public class MainClass {
    public static void main(String[] args){
        VotingRoom vr = new VotingRoom();

        Men men = new Men(vr);
        Women women = new Women(vr);
        OldPerson oldPerson = new OldPerson(vr);

        men.setName("MEN");
        women.setName("WOMEN");
        oldPerson.setName("OLD_PERSON");

        men.start();
        women.start();
        oldPerson.start();
    }
}
