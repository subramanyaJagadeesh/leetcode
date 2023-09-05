public class RunningSum {
    //Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    //
    //Return the running sum of nums.
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int res[] = new int[nums.length];
        res[0] = sum;
        for(int index = 0; index < nums.length; index++) {
            sum += nums[index];
            res[index] = sum;
        }
        return res;
    }
}
