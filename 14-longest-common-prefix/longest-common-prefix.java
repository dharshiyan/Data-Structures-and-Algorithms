class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If the array is empty, there's obviously no prefix
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 1. Start by assuming the first word is the common prefix
        String prefix = strs[0];

        // 2. Loop through the rest of the words in the array
        for (int i = 1; i < strs.length; i++) {
            
            // 3. While the current word does NOT start with the prefix...
            while (strs[i].indexOf(prefix) != 0) {
                
                // 4. Chop off the last character of the prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // 5. If we've chopped it down to nothing, there's no common prefix at all
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}