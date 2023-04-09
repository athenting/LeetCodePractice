package Solutions.Blind75;

/**
 * 是前缀，不是后缀，所以不用考虑后面还有重复的情况
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int length = Integer.MAX_VALUE;
        String shortest = null;
        if (strs.length == 1) {
            return strs[0];
        }

        for (String s : strs) {
            if (s == null || s.length() == 0) {
                //return null if "" or null
                return "";
            }
            //find the shortest one
            if (s.length() < length) {
                length = s.length();
                shortest = s;
            }
        }

        //iterate through the shortest one
        for (int i = 0; i < shortest.length(); i++) {
            char c = shortest.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return shortest.substring(0, i);
                }
            }
        }

        return "";
    }
}
