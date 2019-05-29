package xiancheng;


import org.omg.CORBA.PUBLIC_MEMBER;


class num{
    int num;
    int size;
    boolean flag;

    public num(int num,int size,boolean flag) {
        this.num = num;
        this.size = size;
        this.flag = flag;
    }

    public num() {
    }
}

class xx  implements Runnable{

    num x1 ;
    public xx(num x1){
        this.x1 = x1;
    }

    @Override
    public void run() {
        synchronized (x1) {
            while(x1.num<x1.size) {
                while (x1.size <= 0 || x1.flag) {
                    try {
                        x1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(x1.num);
                x1.num++;
                x1.flag = true;
                x1.notifyAll();
            }
        }
    }


}

class xxx implements Runnable{

    num x1 ;
    public xxx(num x1){
        this.x1 = x1;
    }

    @Override
    public void run() {
        synchronized (x1) {
            while(x1.num<x1.size) {
                while (x1.size <= 0 || (x1.flag == false)) {
                    try {
                        x1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(x1.num);
                x1.num++;
                x1.flag = false;
                x1.notifyAll();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Long l1 = 100L;
        Long l2 = 100L;
        System.out.println(l1==l2);
    }
}
