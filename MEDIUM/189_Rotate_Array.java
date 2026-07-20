// Time Complexity - O(n)+O(k)+O(n-k) => O(2n) => O(n)
// Space Complexity - O(1)

class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        if(n==1){
            return;
        }
        if(k%n==0){
            return;
        }
        k%=n;
        rotate(nums,0,n-1);
        rotate(nums,0,k-1);
        rotate(nums,k,n-1);

    }

    public void rotate(int[] nums, int low,int high){
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }
    }
}