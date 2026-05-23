import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();

        // Split by "/" and filter out empty or "."
        for (String dir : path.split("/")) {
            if (dir.equals("") || dir.equals(".")) {
                continue;
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }

        // Build the simplified path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.insert(0, "/" + dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }

    // Optional: main method for local testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.simplifyPath("/home/"));              // Output: /home
        System.out.println(sol.simplifyPath("/../"));                // Output: /
        System.out.println(sol.simplifyPath("/home//foo/"));         // Output: /home/foo
        System.out.println(sol.simplifyPath("/a/./b/../../c/"));     // Output: /c
    }
}
