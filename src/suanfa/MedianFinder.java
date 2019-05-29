package suanfa;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {

    PriorityQueue<Integer> p1 = null;
    PriorityQueue<Integer> p2 = null;
    Integer mid = null ;
    /** initialize your data structure here. */
    public MedianFinder() {
        //xiao
        p1 = new PriorityQueue<>();

        p2 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

    }

    public void addNum(int num) {
        if(mid == null){
            mid = num;
        }else {
            if(num>mid){
                p1.offer(num);
            }else {
                p2.offer(num);
            }
            if(p1.size()-p2.size() == 2){
                p2.offer(mid);
                mid = p1.poll();
            }else if(p2.size()-p1.size() == 2){
                p1.offer(mid);
                mid = p2.poll();
            }
        }
    }

    public double findMedian() {
        if(p1.size()==p2.size()){
            return (double) mid;
        }else if(p1.size()>p2.size()) {
            return (double)(mid+p1.peek())/2.0;
        }else {
            return (double)(mid+p2.peek())/2.0;
        }
    }

    public static void main(String[] args) {
        MedianFinder s = new MedianFinder();
        s.addNum(1);
        s.addNum(2);
        s.findMedian();
    }
}