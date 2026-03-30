class Solution {
    public int lengthOfLongestSubstring(String s) {
        int num=s.length();
        int maxi=0;
        int[] charz= new int[128];
        Arrays.fill(charz,-1);
        int l=0;
        for (int r=0;r<num;r++ ){
            if (charz[s.charAt(r)]>=l){
                l=charz[s.charAt(r)]+1;

            }
            charz[s.charAt(r)]=r;
            maxi=Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}