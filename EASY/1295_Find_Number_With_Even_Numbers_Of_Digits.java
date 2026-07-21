// Time Complexity - O(n × d); d = maximum number of digits in a number.
// Space Complexity - O(1)

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int digits = 0;
            int temp = nums[i];
            while(temp>0){
                temp /= 10;
                digits++;
            }
            if(digits%2 == 0){
                count++;
            }
        }
        return count;
    }
}