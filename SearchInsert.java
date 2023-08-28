public class SearchInsert {
    //Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    //
    //You must write an algorithm with O(log n) runtime complexity.
    public int searchInsert(int[] nums, int target) {
        for(int i = 0, j=nums.length-1; i<=j; i++,j--){
            if(nums[i] == target)
                return i;
            if(nums[j] == target)
                return j;
            if(target < nums[i])
                return i;
            if(target > nums[j])
                return j+1;
            if(j-i==1 && target > nums[i] && target < nums[j])
                return j;
        }
        return 0;
    }
}
