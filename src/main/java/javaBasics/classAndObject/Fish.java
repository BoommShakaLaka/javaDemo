package javaBasics.classAndObject;

public class Fish extends Animal {
    String colour;
    public Fish(String myName, int myId) {
        super(myName, myId);
    }

    public Fish(String colour){
        this.colour = colour;
    }

    public void fishColour(){
        System.out.println("鱼的颜色为："+colour);
    }
}
