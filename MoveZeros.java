public class MoveZeros {
    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //
    //Note that you must do this in-place without making a copy of the array.
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while(right<nums.length){
            if(nums[right]!=0){
                nums[left++] = nums[right];
            }
            right++;
        }
        while(left<nums.length){
            nums[left++] = 0;
        }
    }
}
