package xuliehua;


import java.io.*;

class C implements Externalizable {

    private static final long serialVersionUID = 1L;


    public B bbb;
    public static int aaa = 10;
    transient public int a ;
    public int b ;
    public String c;

    public C() {
    }

    public C(int a,int b,String c,B bbb){
        this.a = a;
        this.b = b;
        this.c = c;
        this.bbb = bbb;
    }

    @Override
    public String toString() {
        return "C{" +
                "bbb=" + bbb +
                ", a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(a);
        out.writeObject(b);
        out.writeObject(c);
        out.writeObject(bbb);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.a = (int)in.readObject();
        this.b = (int)in.readObject();
        this.c = (String)in.readObject();
    }
}


public class Main1 {

    public static void main(String[] args) throws Exception {
        B b = new B(3,4);
        C a = new C(1,2,"aaaa",b);
        OutputStream f = new FileOutputStream("D:/a.txt");
        ObjectOutput out = new ObjectOutputStream(f);

        out.writeObject(a);

        C.aaa = 5;

        InputStream f1 = new FileInputStream("D:/a.txt");
        ObjectInput in = new ObjectInputStream(f1);
        C b1 = (C) in.readObject();

        System.out.println(b1.toString());
    }

}
