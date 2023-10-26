public class MaxConsecutiveOnes3 {
    //Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                k--;
            }
            if(k<0){
                k += 1- nums[left];
                left++;
            }
            right++;
        }
        return right - left;
    }
}
