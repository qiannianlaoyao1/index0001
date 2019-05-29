package suanfa;

public class bingchaji  {

    int pre[] = new int[1000];
    void init(int n){
        for(int i=0;i<n;i++){
            pre[i] = i;
        }
    }
    int Find(int x){
        int p = x;
        while(x!=pre[x]){
            x = pre[x];
        }
        while(p!=x){
            int y = pre[p];
            pre[p] = x;
            p = y;
        }
        return x;
    }
    void mix(int x,int y){
        int fx = Find(x);
        int fy = Find(y);
        if(fx!=fy){
            pre[fx] = fy;
        }
    }

}
