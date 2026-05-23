class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;

        while (num <= n * n) {
            for (int i = left; i <= right && num <= n * n; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom && num <= n * n; i++) {
                matrix[i][right] = num++;
            }
            right--;

            for (int i = right; i >= left && num <= n * n; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            for (int i = bottom; i >= top && num <= n * n; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }

    // Optional: main method for local testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] result = sol.generateMatrix(3);

        // Print the matrix
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
