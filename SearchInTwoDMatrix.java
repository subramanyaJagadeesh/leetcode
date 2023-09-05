public class SearchInTwoDMatrix {
    //You are given an m x n integer matrix with the following two properties:
    //
    //Each row is sorted in non-decreasing order.
    //The first integer of each row is greater than the last integer of the previous row.
    //Given an integer target, return true if target is in matrix or false otherwise.
    //
    //You must write a solution in O(log(m * n)) time complexity.
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int low = 0;
        int high = matrix[row].length - 1;
        while(low <= high && row < matrix.length){
            int mid = low + (high - low) / 2;
            if(matrix[row][mid] == target) {
                return true;
            }
            else if(matrix[row][mid] > target){
                high = mid - 1;
            }
            else if(matrix[row][mid] < target && matrix[row][high] >= target){
                low = mid+1;
            }
            else if(matrix[row][high] < target){
                row++;
                low = 0;
                high = matrix[0].length -1;
            }
        }
        return false;
    }
}
