class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }

        int[] prev = newInterval;
        while (i < n && intervals[i][0] <= prev[1]) {
            prev[0] = Math.min(prev[0], intervals[i][0]);
            prev[1] = Math.max(prev[1], intervals[i][1]);
            i++;
        }
        list.add(prev);

        while (i < n) {
            list.add(intervals[i]);
            i++;
        }

        return list.toArray(new int[list.size()][]);
    }
}