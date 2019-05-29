package beibao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution{
    
    public List<String> getResult(int n, int[] nums){
        Arrays.sort(nums);
        if(nums.length == 1) {

        }else if(nums.length == 2){

        }else {
            int minn = 0x3f3f3f3f;
            for(int i=1;i<nums.length-1;i++){
                int x = nums[i]-nums[i-1];
                int y = nums[i+1]-nums[i];
                int z = Math.min(x,y);
                minn = Math.min(z,minn);
            }
        }
        return null;
    }
}