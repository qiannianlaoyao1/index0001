package xuliehua;

import java.io.*;


class B{
    private int x ;
    private int y ;

    public B(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public B() {
    }

    @Override
    public String toString() {
        return "B{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}

class A implements Serializable{

    private static final long serialVersionUID = 1L;


    public static int aaa = 10;
    transient public int a ;
    public int b ;
    public String c;

    public A() {
    }

    public A(int a,int b,String c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "A{" +
                ", a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                '}';
    }
}

class CC extends  A{
    int a;
    int b;

    public CC() {
    }

    public CC(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public CC(int a, int b, String c, int a1, int b1) {
        super(a, b, c);
        this.a = a1;
        this.b = b1;
    }

    @Override
    public String toString() {
        return "CC{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        //B b = new B(3,4);
//        A a = new A(1,2,"aaaa");
//        OutputStream f = new FileOutputStream("D:/a.txt");
//        ObjectOutput out = new ObjectOutputStream(f);
//
//        out.writeObject(a);
//
//        A.aaa = 5;
//
//        InputStream f1 = new FileInputStream("D:/a.txt");
//        ObjectInput in = new ObjectInputStream(f1);
//        A b1 = (A) in.readObject();
//
//        System.out.println(b1.toString());
        CC c = new CC(1,2);
        OutputStream f = new FileOutputStream("D:/a.txt");
        ObjectOutput out = new ObjectOutputStream(f);
        InputStream f1 = new FileInputStream("D:/a.txt");
        ObjectInput in = new ObjectInputStream(f1);
        out.writeObject(c);

        CC cc = (CC) in.readObject();
        System.out.println(cc.toString());

    }

}
