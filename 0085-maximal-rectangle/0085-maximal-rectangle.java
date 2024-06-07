import java.util.Stack;

class Solution {

    public static int[] nsr(int[] arr, int size) {
        int[] right = new int[size];
        Stack<Integer> stack = new Stack<>();
        for (int i = size - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                right[i] = size;
            } else {
                right[i] = stack.peek();
            }
            stack.push(i);
        }
        return right;
    }

    public static int[] nsl(int[] arr, int size) {
        int[] left = new int[size];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        return left;
    }

    public static int mah(int[] arr, int size) {
        int[] right = nsr(arr, size);
        int[] left = nsl(arr, size);
        int maxArea = 0;
        for (int i = 0; i < size; i++) {
            int width = right[i] - left[i] - 1;
            int area = arr[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int[] v = new int[m];
        int max = 0;

        for (int j = 0; j < m; j++) {
            v[j] = matrix[0][j] == '1' ? 1 : 0;
        }
        max = mah(v, m);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0') {
                    v[j] = 0;
                } else {
                    v[j] += 1;
                }
            }
            max = Math.max(max, mah(v, m));
        }

        return max;
    }
}