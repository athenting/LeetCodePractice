package Solutions.Blind75;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charCounts = new HashMap<>();
        // Create a map of characters and their counts in the magazine string
        for (char c : magazine.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        // Iterate through the ransomNote string and check if each character is present in the map
        // and has a count greater than 0
        for (char c : ransomNote.toCharArray()) {
            if (!charCounts.containsKey(c) || charCounts.get(c) == 0) {
                return false;
            }
            charCounts.put(c, charCounts.get(c) - 1);
        }
        return true;
    }

}
