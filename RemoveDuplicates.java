// solution without using hashmap
// we have slow and fast pointer
// slow retain position for next unique element
// fast pointer is searching for next unique element

// Time : O(n)
// Space : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int slow = 0, fast = 0;
        int count = 0;
        int n = nums.length;

        while(fast < n) {
            if(fast != 0 && nums[fast] == nums[fast-1]) {
                count++;
            }else{
                count = 1;
            }

            if(count <= k) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}