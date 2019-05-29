package clone;

public class Main {
    public static void main(String[] args) {
        whd xx = new whd("123");
        whdd x = new whdd("aaa",xx);

        whdd xxx = null;
        try {
            xxx = (whdd) x.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        xx.setName("234");



        System.out.println(x.toString());
        System.out.println(xxx.toString());

        System.out.println(x==xxx);

    }
}
class  whdd implements  Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        whdd x = (whdd) o;
        x.ss = (whd) x.getSs().clone();
        return x;
    }

    private String name;
    private whd ss;

    public whdd() {
    }

    public whdd(String name, whd ss) {
        this.name = name;
        this.ss = ss;
    }

    @Override
    public String toString() {
        return "whdd{" +
                "name='" + name + '\'' +
                ", ss=" + ss +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public whd getSs() {
        return ss;
    }

    public void setSs(whd ss) {
        this.ss = ss;
    }
}

class whd implements  Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "whd{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    public whd(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
