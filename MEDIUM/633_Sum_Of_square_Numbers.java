// Difficulty - Medium
// Time Complexity - O(√c)
// Space Complexity - O(1)

class Solution {
    public boolean judgeSquareSum(int c) {
        int low = 0;
        int high = (int)Math.sqrt(c);
        while(low<=high){

            long ans = (long)low * low + (long)high * high;

            if(ans == c){
                return true;
            }
            else if(ans > c){
                high--;
            }
            else{
                low++;
            }
        }
        return false;
    }
}