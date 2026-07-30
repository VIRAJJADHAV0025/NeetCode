class Solution {
    public boolean isAnagram(String s, String t) {
        // Store lengths of both strings
        int sl = s.length();
        int tl = t.length();
        // Anagrams must have equal length — early exit if not
        if(sl != tl) {
            return false;
        }
        // Frequency array of size 26 — one slot per alphabet letter
        int[] arr = new int[26];
        // Increment count for each character in string s
        for(int i = 0; i < s.length(); i++) {
            // s.charAt(i) - 'a' converts character to index (a=0, b=1, ... z=25)
            arr[s.charAt(i) - 'a']++;
        }
        // Decrement count for each character in string t
        for(int i = 0; i < t.length(); i++) {
            // If count goes negative, t has a character s doesn't have
            // meaning they are not anagrams
            arr[t.charAt(i) - 'a']--;
            if(arr[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        // All character frequencies balanced — strings are anagrams
        return true;
    }
}
