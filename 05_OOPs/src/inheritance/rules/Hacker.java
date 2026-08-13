package inheritance.rules;

//public class Hacker extends Account, Bank{  // a class can't extend multiple classes
public class Hacker extends Account{
    void display(){
//        System.out.println(accNum + " - " + pin); // we can't use private variables of Parent class
        System.out.println(accHolderName + " - " + age); // inherited variables
    }

    // overriding private variables are not allowed
    void changeData(){
//        accNum = 8984;
//        pin = 1010;
        accHolderName = "Siva Kumar";
        age = 48;
    }
}
