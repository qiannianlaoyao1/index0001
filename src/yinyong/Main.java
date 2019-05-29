package yinyong;

class C{
    int a;
    String b;

    public C(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public C() {
    }

    @Override
    public String toString() {
        return "C{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}

public class Main {

    public static void get(C c){
        c = new C(2,"bbb");
        System.out.println(c.toString());
    }
    public static void main(String[] args) {
        final C c = new C(1,"aaa");
        System.out.println(c.toString());

        c.a = 2;
        System.out.println(c.toString());
    }

}
