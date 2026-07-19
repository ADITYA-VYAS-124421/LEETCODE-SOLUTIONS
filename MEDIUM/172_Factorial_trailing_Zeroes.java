// Difficulty - Medium
// Time Complexity - O(log₅ n)
// Space Complexity - O(1)

class Solution {

    public int trailingZeroes(int n) {
        if(n==0){
            return 0;
        }
        int count = 0;
        while(n>0){
            n=n/5;
            count += n;
        }
        return count;   
    }
    
}