package xiancheng;


class S implements Runnable{

    //int x = 1;
    ThreadLocal<Integer> x = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public void run() {
    }
}

public class TheadLoaclTest {
    public static void main(String[] args) {
        S s1 = new S();
        S s2 = new S();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
    }

}
