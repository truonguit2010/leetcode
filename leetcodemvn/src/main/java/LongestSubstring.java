import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                System.out.println("-----------------------------------------------");
                System.out.println("char " + s.charAt(j) + " at j = " + j);
                if (map.containsKey(s.charAt(j))) {
                    System.out.println("last i: " + i);
                    System.out.println("char i: " + map.get(s.charAt(j)));

                    // Fix case sub in center like dvavd
                    i = Math.max(map.get(s.charAt(j)), i);
                    System.out.println("i: " + i);
                }
                System.out.println("length: " + (j - i + 1));
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int substringCount = solution.lengthOfLongestSubstring("dvbvdf");
        System.out.println("Substring length: " + substringCount);
    }


}
