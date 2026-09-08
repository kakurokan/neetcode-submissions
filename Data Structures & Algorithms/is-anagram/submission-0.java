class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> counts1 = new HashMap<>();

        for(char c : s.toCharArray()){
            counts1.merge(c, 1, Integer::sum);
        }

        HashMap<Character, Integer> counts2 = new HashMap<>();

        for(char c : t.toCharArray()){
            counts2.merge(c, 1, Integer::sum);
        }

        return counts1.equals(counts2);
    }
}
