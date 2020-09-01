package javaBasics.classAndObject;

import org.junit.Test;

public class ExtendsTest {
    @Test
    public void test1(){
        Animal dog = new Dog("大黄",01);
        dog.eat();
        dog.sleep();
    }

    @Test
    public void test2(){
        Dog dog = new Dog("大黄",02,"牧羊犬");
        dog.eat();
        dog.sleep();
        dog.dogSpecies();
    }

    @Test
    public void test3(){
        Fish fish = new Fish("write");
        fish.fishColour();
    }


}
