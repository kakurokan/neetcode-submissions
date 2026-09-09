class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Set<Character> set = new HashSet<>();
        int low = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            while (set.contains(c)) {
                set.remove(s.charAt(low++));
            }

            set.add(c);
            longest = Math.max(longest, r - low + 1);
        }

        return longest;
    }
}
