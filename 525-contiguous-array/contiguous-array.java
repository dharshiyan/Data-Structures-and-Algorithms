class Solution {
    public int findMaxLength(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int max_len=0;
        int count=0;
        for (int i=0;i<nums.length;i++){
            count+= (nums[i]==1)? 1:-1;
            if(map.containsKey(count)){
                int previous_index=map.get(count);
                max_len=Math.max(max_len,i-previous_index);

            }
            else{
                map.put(count,i);
            }
        }
        return max_len;
    }
}