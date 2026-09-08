class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> counts1 = new HashMap<>();
        HashMap<Character, Integer> counts2 = new HashMap<>();


        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            counts1.merge(c1, 1, Integer::sum);
            counts2.merge(c2, 1, Integer::sum);
        }

        return counts1.equals(counts2);
    }
}
