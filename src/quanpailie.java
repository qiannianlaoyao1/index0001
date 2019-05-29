import java.util.Scanner;

public class quanpailie {

    public static void swap(int i,int j,int[] a){
        int n = a[i];
        a[i] = a[j];
        a[j] = n;
    }

    public static void get(int n,int x,int[] a){
        if(x==n){
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }

        for(int i=x;i<n;i++){

            // 去重
            if(i!=x&&a[i]==a[x]) {
                continue;
            }
            swap(i,x,a);
            get(n,x+1,a);
            swap(i,x,a);

        }

    }

   public static void main(String[] args) {
        int n;
       Scanner in  = new Scanner(System.in);
        while(in.hasNext()) {
            n = in.nextInt();
            int[] a = new int[n+1];
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            get(n,0,a);


        }
    }


}
