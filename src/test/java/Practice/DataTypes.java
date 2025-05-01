package Practice;

public class DataTypes {
    // Primitive  data types
    short a = 40;
    int b = 50;
    long c = 86453 ;
    float f = 9754.987345f;
    double d1 = 8264.89575;
    long l = 98635678;
    boolean bool = true;
    boolean bool1= false;
    char ch = 'a';
    char ch1 = '\t';

// Advanced or wrapper data types

    String s = "test";
    String s1 =new String("test");
    Integer i = 400;
    Integer i1 = new Integer(150);
    Double dd1 = 12.5;
    Short ss1= 12;
    Long l1= 1234L;
    Float f1 = 123.1f;
    Character c1 = 'f';

    public static void main(String[] args) {
    //primitive
        System.out.println("Primitive data types:");
        DataTypes dtype = new DataTypes();
        System.out.println(dtype.a);
        System.out.println(dtype.b);
        System.out.println(dtype.c);
        System.out.println(dtype.f);
        System.out.println(dtype.d1);
        System.out.println(dtype.l);
        System.out.println(dtype.bool);
        System.out.println(dtype.bool1);
        System.out.println(dtype.ch);
        System.out.println(dtype.ch1);

        //Advanced/wrapper
        System.out.println("Wrapper or advanced data types: ");
        System.out.println(dtype.s);
        System.out.println(dtype.s1);
        System.out.println(dtype.i);
        System.out.println(dtype.i1);
        System.out.println(dtype.dd1);
        System.out.println(dtype.ss1);
        System.out.println(dtype.l1);
        System.out.println(dtype.f1);
        System.out.println(dtype.c1);

    }

}
