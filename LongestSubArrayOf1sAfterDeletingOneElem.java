public class LongestSubArrayOf1sAfterDeletingOneElem {
    //Given a binary array nums, you should delete one element from it.
    //
    //Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
    public int longestSubarray(int[] nums) {
        int del = -1;
        int left = 0;
        int right = 0;
        int res = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                if(del > -1){
                    res = Math.max(res, right-left-1);
                    left = del+1;
                }
                del = right;
            } else {
                res = Math.max(res, right-left);
            }
            right++;
        }
        return res;
    }
}
