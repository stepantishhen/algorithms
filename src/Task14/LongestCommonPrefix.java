package Task14;

import java.util.Arrays;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        Integer firstStringLength = strs[0].length();
        Integer lastStringLength = strs[strs.length - 1].length();
        Integer minLength = Math.min(firstStringLength, lastStringLength);
        for (int i = 0; i < minLength; i++) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                result.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
