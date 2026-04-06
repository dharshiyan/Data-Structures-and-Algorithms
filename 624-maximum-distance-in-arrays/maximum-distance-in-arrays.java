class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int small = arrays.get(0).get(0);
        int big = arrays.get(0).get(arrays.get(0).size() - 1);
        int MaxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            MaxDistance = Math.max(MaxDistance, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - small));
            MaxDistance = Math.max(MaxDistance, Math.abs(big - arrays.get(i).get(0)));
            small = Math.min(small, arrays.get(i).get(0));
            big = Math.max(big, arrays.get(i).get(arrays.get(i).size() - 1));
        }

        return MaxDistance;
    }
}