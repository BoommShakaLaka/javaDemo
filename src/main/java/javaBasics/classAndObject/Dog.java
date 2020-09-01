package javaBasics.classAndObject;

public class Dog extends Animal{
    private String species;

    public Dog(String myName, int myId) {
        super(myName, myId);
    }

    public Dog(String myName, int myId,String mpecies){
        super(myName, myId);
        this.species = mpecies;
    }
    public void dogSpecies(){
        System.out.println("种类为: "+species);
    }
}
