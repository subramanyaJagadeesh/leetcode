import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    //
    //Notice that the solution set must not contain duplicate triplets.
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int pivot = 0;
        List<List<Integer>> result = new ArrayList<>();
        while(pivot < nums.length-2){
            int left = pivot + 1;
            int right = nums.length - 1;
            if(pivot == 0 || nums[pivot] != nums[pivot -1])
                while(left < right){
                    if(nums[left] + nums[right] == -nums[pivot]){
                        result.add(Arrays.asList(nums[pivot], nums[left++], nums[right--]));
                        while(left < right && nums[left] == nums[left-1])
                            left++;
                    } else if(nums[left] + nums[right] > -nums[pivot]){
                        right--;
                    } else if(nums[left] + nums[right] < -nums[pivot]){
                        left++;
                    }
                }
            pivot++;
        }
        return result;
    }
}
