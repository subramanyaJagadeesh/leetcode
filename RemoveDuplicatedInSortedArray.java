public class RemoveDuplicatedInSortedArray {
    //Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
    //
    //Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
    //
    //Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    //Return k.
    //Custom Judge:
    //
    //The judge will test your solution with the following code:
    //
    //int[] nums = [...]; // Input array
    //int[] expectedNums = [...]; // The expected answer with correct length
    //
    //int k = removeDuplicates(nums); // Calls your implementation
    //
    //assert k == expectedNums.length;
    //for (int i = 0; i < k; i++) {
    //    assert nums[i] == expectedNums[i];
    //}
    //If all assertions pass, then your solution will be accepted.
    public void heapify(int[] nums, int len, int lIndex){
        int largest = lIndex;
        int left = largest * 2 + 1;
        int right  = largest * 2 + 2;

        if(right < len && nums[right] > nums[largest])
            largest = right;

        if(left < len && nums[left] > nums[largest])
            largest = left;

        if(largest != lIndex){
            int num = nums[lIndex];
            nums[lIndex] = nums[largest];
            nums[largest] = num;

            heapify(nums, len, largest);
        }

    }

    public void sort(int[] nums) {
        for(int i = nums.length/2 - 1 ; i >= 0; i--)
            heapify(nums, nums.length, i);

        for(int i = nums.length-1; i > 0; i--){
            int num = nums[0];
            nums[0] = nums[i];
            nums[i] = num;

            heapify(nums, i, 0);
        }
    }
    public int removeDuplicates(int[] nums) {
        int duplicateNumber = nums[0];
        int k = nums.length;
        int i = 1;
        while(i<=nums.length-1){
            if(nums[i] == duplicateNumber){
                k--;
                nums[i] = 101;
            } else {
                duplicateNumber = nums[i];
            }
            i++;
        }
        sort(nums);
        return k;
    }
}