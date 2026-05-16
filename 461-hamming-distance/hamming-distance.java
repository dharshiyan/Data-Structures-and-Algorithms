// Solution 1 : Brian Kernighan’s Algorithm
class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0;
        for (int temp = x ^ y; temp > 0; ++res){
            temp = temp & (temp -1);
        }
        return res;
    }
}