package javaBasics.classAndObject;

public class Animal {
    private String name;
    private int id;
    public Animal(String myName,int myId){
        name = myName;
        id = myId;
    }

    public Animal(){

    }

    public void eat(){
        System.out.println(name+"正在吃。。");
    }
    public void sleep(){
        System.out.println(name+"正在睡。。");
    }
    public void introduciton(){
        System.out.println("大家好！ 我是"+id+"号"+name);
    }

}
