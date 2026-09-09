class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int res = 0;
        int l = 0;
        int mf = 1;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            count.put(c, count.getOrDefault(c, 0) + 1);
            mf = Math.max(mf, count.get(c));

            while ((r - l + 1) - mf > k) {
                char cl = s.charAt(l);
                count.put(cl, count.get(cl) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
