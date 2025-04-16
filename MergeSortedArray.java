// we use 3 ptr one for last elem in num1, second for num2
// and third for position to which we have to copy the elements
// Time : O(mxn), Space : O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1;
        int idx = m+n-1;

        while(p1 >= 0 && p2 >= 0) {
            if(nums2[p2] > nums1[p1]) {
                nums1[idx] = nums2[p2];
                p2--;
            }else{
                nums1[idx] = nums1[p1];
                p1--; 
            }
            idx--;
        }
        while(p2 >= 0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}