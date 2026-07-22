// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            nums[i] += (nums[nums[i]] % n) * n;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] /= n;
        }
        return nums;
    }
}