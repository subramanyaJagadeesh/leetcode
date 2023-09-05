public class MedianOTwoSArrays {
    //Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    //
    //The overall run time complexity should be O(log (m+n)).
    public int[] sortedMergedArray(int[] nums1, int[] nums2){
        int i, j, k;
        i = j = k = 0;
        int[] arr = new int [nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            arr[k] = nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        return arr;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int joinedArray[] = sortedMergedArray(nums1, nums2);
        double median = 0;
        if(joinedArray.length %2 == 0) {
            int middle = joinedArray.length/2;
            median = (double)(joinedArray[middle]+joinedArray[middle-1])/2;
        } else {
            int middle = (int) joinedArray.length/2;
            median = joinedArray[middle];
        }
        return median;
    }
}
