package tencent;

import java.util.*;
class node{

    public int x;
    public int y;

    public node() {

    }

    public node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();

            node[] a = new node[n];
            node[] b = new node[m];

            for(int i=0;i<n;i++){
                int x1 = in.nextInt();
                int y1 = in.nextInt();
                a[i] = new node(x1,y1);
            }
            for(int i=0;i<m;i++){
                int x1 = in.nextInt();
                int y1 = in.nextInt();
                b[i] = new node(x1,y1);
            }
            //System.out.println("yes");

            Arrays.sort(a, new Comparator<node>() {
                @Override
                public int compare(node o1, node o2) {
                    if(o1.x == o2.x){
                        return o1.y-o2.y;
                    }else {
                        return o1.x-o2.x;
                    }
                }
            });

            Arrays.sort(b, new Comparator<node>() {
                @Override
                public int compare(node o1, node o2) {
                    if(o1.x == o2.x){
                        return o1.y-o2.y;
                    }else {
                        return o1.x-o2.x;
                    }
                }
            });



        }
    }

}
