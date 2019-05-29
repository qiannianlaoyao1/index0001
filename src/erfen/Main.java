package erfen;

public class Main {

    public static int erfen (int[] a,int k){
        int l = 0,r = a.length-1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid] == k){
                return mid;
            }else if(a[mid]>k){
                r= mid-1;
            }else {
                l = mid+1;
            }
        }
        return ans;
    }

    // 第一个大于它的数
    public static int erfens (int[] a,int k){
        int l = 0,r = a.length-1;
        int ans = -1;
        while(l<r){
            int mid = (l+r)/2;
            if(a[mid]<=k){
                l = mid+1;
            }else {
                r = mid;
            }
        }
        return l;
    }

    // 第一个比他大于等于他的
    public static int erfenx (int[] a,int k){
        int l = 0,r = a.length-1;
        int ans = -1;
        while(l<r){
            int mid = (l+r)/2;
            if(a[mid]>=k){
                r = mid;
            }else {
                l = mid+1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int a[] = {1,1,3,3,5,5,7,8,100};
        int x = erfen(a,8);
        System.out.println(x);

        int y = erfens(a,2);
        System.out.println(y);

        int z = erfenx(a,4);
        System.out.println(z);
    }

}
