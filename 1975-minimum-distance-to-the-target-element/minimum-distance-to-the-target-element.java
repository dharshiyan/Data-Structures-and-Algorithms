class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        // We start with a very large distance as our initial "best"
        int minDistance = Integer.MAX_VALUE;

        // Loop through every number in the array
        for (int i = 0; i < nums.length; i++) {
            // If we find a number that matches our target...
            if (nums[i] == target) {
                // Calculate how far away this index is from our start
                int currentDistance = Math.abs(i - start);

                // If this is the closest one we've seen so far, save it
                if (currentDistance < minDistance) {
                    minDistance = currentDistance;
                }
                
                // Optional optimization: If distance is 0, we can't get any closer
                if (minDistance == 0) return 0;
            }
        }

        return minDistance;
    }
}