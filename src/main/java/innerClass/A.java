package innerClass;

public class A {
    int external = 12;

    public void externalSay() {
        System.out.println("这是外部类当中的方法");
    }

    class B {
        int inner = 13;

        public void innerSay() {
            System.out.println("这是内部类当中的方法");
            System.out.println(":" +( external + inner));
        }
    }
}
