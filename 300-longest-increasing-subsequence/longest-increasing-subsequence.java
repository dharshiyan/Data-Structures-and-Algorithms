import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxlength = 1;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    // Fix 1: Change -1 to +1 to extend the subsequence length
                    dp[i] = Math.max(dp[i], dp[j] + 1); 
                }
            }
            // Fix 2: Moved inside the outer loop where 'i' is in scope
            maxlength = Math.max(maxlength, dp[i]); 
        }
        
        return maxlength;
    }
}