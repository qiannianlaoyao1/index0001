package bitmap;

public class BitMap {

    private int num;

    private byte[] a;

    public BitMap(){

    }

    public BitMap(int n){
        if(n%8==0){
            this.num = n>>3;
        }else {
            this.num = (n/8)+1;
        }
        a = new byte[num];
    }

    public int getIndex(int n){
        return n>>3;
    }

    public int getWei(int n){
        return n%8;
    }

    public void set(int n){
        //System.out.println(getIndex(n)+" "+ getWei(n));
        a[getIndex(n)] |= 1<<(getWei(n));
    }

    public boolean isE(int n){
        return (a[getIndex(n)] &= 1<<(getWei(n)))!=0;
    }

    public void show(){
        for(int i=0;i<num;i++){
            byte x = a[i];
            for(int j=0;j<8;j++){
                int xx = (x&(1<<j));
                if(xx!=0) {
                    int xxx;
                    xxx = j+8*i;
                    System.out.println(xxx);
                }
            }
        }
    }

    public static void main(String[] args) {
        BitMap b = new BitMap(100);
        for(int i=1;i<=10;i++){
            b.set(i);
        }
        b.show();



    }

}
