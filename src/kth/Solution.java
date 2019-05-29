package kth;

public class Solution {

    public static void swap(int[] a,int x,int y){
        int xx = a[x];
        a[x] = a[y];
        a[y] = xx;
    }

    public static int quick(int[] a,int l,int r){
        while(l<r){
            int x = a[l];
            while(l<r&&a[r]>=x){
                r--;
            }
            swap(a,l,r);
            while(l<r&&a[l]<x){
                l++;
            }
            swap(a,l,r);
        }
        return l;
    }

    public static int qsort(int[] a,int l,int r,int k){
        int ans = a[l];
        if(l<r){
            int mid = quick(a,l,r);
            if(mid == a.length-k){
                return a[mid];
            }else if(mid>a.length-k){
                r = mid-1;
                ans = qsort(a,l,r,k);
            }else {
                l = mid+1;
                ans = qsort(a,l,r,k);
            }
        }
        return ans;

    }

    public int findKthLargest(int[] nums, int k) {
       return qsort(nums,0,nums.length-1,k);
    }
}











//
//hashmap ，数组+链表，
//拉链法， hashcode 相同的时候在数组中创建一个链表
//hashcode 相同 值也相同
//也就是equals 和 hashcode 都相同
//
//一个是数组一个是链表
//当插入和删除较多的时候 用link的
//arraylist 则适合插入删除少的 用来随机访问
//
//
//synchronized
//或者用reentanlock



































