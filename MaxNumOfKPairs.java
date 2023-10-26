import java.util.HashMap;
import java.util.Map;

public class MaxNumOfKPairs {
    //You are given an integer array nums and an integer k.
    //
    //In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
    //
    //Return the maximum number of operations you can perform on the array.
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0;i< nums.length; i++){
            if(k-nums[i] <= 0){
                continue;
            }
            if(m.containsKey(nums[i]) && m.get(nums[i]).intValue()>0){
                m.put(nums[i], m.get(nums[i])-1);
                count++;
            } else
                m.put(k-nums[i], m.getOrDefault(k-nums[i],0)+1);
        }
        return count;
    }
}
