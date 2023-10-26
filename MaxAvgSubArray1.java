public class MaxAvgSubArray1 {
    //You are given an integer array nums consisting of n elements, and an integer k.
    //
    //Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
    public double findMaxAverage(int[] nums, int k) {
        double max_avg = -1;
        int i = 0;
        double sum = 0;
        while(i<k){
            sum += nums[i];
            i++;
        }
        max_avg = sum/k;
        while(i < nums.length){
            sum -= nums[i-k];
            sum += nums[i];
            max_avg = Math.max(max_avg, sum/k);
            i++;
        }
        return max_avg;
    }
}
