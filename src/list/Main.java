package list;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] book = new int[2005];
            int l = 0,r = 0;
            int sum = 0;

            int minn = 0x3f3f3f3f;
            for(r = 0;r<n;r++){
                if(book[a[r]]==0&&a[r]!=0){
                    sum++;
                }
                book[a[r]]++;
                if(sum == m){
                    minn = Math.min(minn,r-l+1);
                }
                while(sum==m&&book[a[l]]>1&&l<=r){
                    book[a[l]]--;
                    l++;
                    minn = Math.min(minn,r-l+1);
                }
            }
            System.out.println(minn);

        }
    }
}