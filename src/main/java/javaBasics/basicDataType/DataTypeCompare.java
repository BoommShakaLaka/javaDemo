package javaBasics.basicDataType;

import org.junit.Test;

/**
 * 一：基本类型和基本封装类型
 * 1.基本型和基本型封装型进行“==”运算符的比较，封装型将会自动拆箱变为基本型后再进行比较。
 * 如Integer和int; Character和char。另外，基本型是不能赋值为null的。封装型可以。
 * 另外，对于封装型和基本型比较最好使用(封装型).equals(基本型），同时保证封装型不为空。
 * 这时候，先会进行自动装箱，基本型转换为其封装类型,若类型不同返回false。
 * 2.两个基本型的封装型进行equals()比较，首先equals()会比较类型，
 * 如果类型相同，则继续比较值，如果值也相同，返回true
 * 二: ==和equals
 * 1.两个基本类型的只能用 ==
 * 2.至少有一个封装型的建议使用.equals。
 * 3. 用==对基本型和封装性比较必须保证封装型不为null。如果为null则不能转化为基本型就会报错。
 * 4.用==来比较两个封装行的话，比较的是地址。
 */

public class DataTypeCompare {
    @Test
    public void CharacterTest() {
        Character c1 = 'Y';
        Character c2 = 'Y';
        char c1_1  = 'Y';
        char c2_2  = 'Y';
        System.out.println(System.identityHashCode(c1)+"  "+System.identityHashCode(c1_1));
        System.out.println(System.identityHashCode(c2)+"  "+System.identityHashCode(c2_2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        Character c3 = new Character('Y');
        Character c4 = new Character('Y');
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c3 == c4);
        System.out.println(c3.equals(c4));
        char c5 = 'Y';
        char c6 = 'Y';
        System.out.println(c5 == c6);
//        System.out.println(c5.equals(c6)); 编译报错
    }

    @Test
    public void IntegerTest() {
        Integer i1 = 257;
        Integer i2 = 257;
        int i1_1 = 257;
        int i2_2 = 257;
        System.out.println(System.identityHashCode(i1)+"  "+System.identityHashCode(i1_1));
        System.out.println(System.identityHashCode(i2)+"  "+System.identityHashCode(i2_2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        Integer i3 = new Integer(257);
        Integer i4 = new Integer(257);
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }

    @Test
    public void LongTest() {
        Long l1 = 12345L;
        Long l2 = 12345L;
        System.out.println(System.identityHashCode(l1));
        System.out.println(System.identityHashCode(l2));
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
    }

    @Test
    public void ByteTest() {
        Byte b1 = 1;
        Byte b2 = 1;
        System.out.println(System.identityHashCode(b1));
        System.out.println(System.identityHashCode(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }

    @Test
    public void ShortTest() {
        Short s1 = 1;
        Short s2 = 1;
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

    @Test
    public void FloatTest() {
        Float f1 = 1f;
        Float f2 = 1f;
        System.out.println(System.identityHashCode(f1));
        System.out.println(System.identityHashCode(f2));
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());
    }

    @Test
    public void DoubleTest(){
        Double d1 = 1234.45;
        Double d2 = 1234.45;
        System.out.println(System.identityHashCode(d1));
        System.out.println(System.identityHashCode(d2));
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }

    @Test
    public void BooleanTest(){
        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(System.identityHashCode(b1));
        System.out.println(System.identityHashCode(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
