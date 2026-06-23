class Solution {
    public void moveZeroes(int[] nums) {
        int current = 0;
        for (int next=0; next<nums.length;next++){
            if (nums[next]!=0) nums[current++]=nums[next];
        }
        while(current<nums.length)  nums[current++]=0;
    }
}