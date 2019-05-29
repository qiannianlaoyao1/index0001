package xiancheng;

class MyMySum{
    int sum;
}

class A extends Thread {

    private MyMySum sum1 ;

    private  MyMySum sum2;

    public MyMySum getSum2() {
        return sum2;
    }

    public void setSum2(MyMySum sum2) {
        this.sum2 = sum2;
    }

    public MyMySum getMyMySum() {
        return sum1;
    }

    public void setMyMySum(MyMySum sum) {
        this.sum1 = sum;
    }

    @Override
    public void run() {
        synchronized (this){
            while(sum1.sum<5050&&sum2.sum<=100) {

                sum2.sum++;
                sum1.sum+= sum2.sum;
                //System.out.println(Thread.currentThread().getName() + " " + sum1.sum);
                //this.notifyAll();
            }
        }
    }
}

public class sum {

    public static void main(String[] args) throws InterruptedException {
        MyMySum sum = new MyMySum();
        A[] a = new A[4];
        MyMySum sum2 = new MyMySum();

        for(int i=0;i<4;i++){
            a[i] = new A();
            a[i].setMyMySum(sum);
            a[i].setSum2(sum2);
        }

        for(int i=0;i<4;i++){
            a[i].start();
        }

        for (int i=0;i<4;i++){
            a[i].join();
        }

        System.out.println(sum.sum);

    }
}
