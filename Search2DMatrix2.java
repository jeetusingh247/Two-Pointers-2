// elements below top right element are always greater in same column
// elements on left are always smaller in same row
// we start from top right corner and check if the element is equal to target
// Time : O(m + n), Space : O(m + n)  


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = m-1, c = 0;

        while(r >= 0 && c < n) {
            if(matrix[r][c] == target)  return true;
            else if(matrix[r][c] < target) c++;
            else r--;
        }
        return false;
    }
}