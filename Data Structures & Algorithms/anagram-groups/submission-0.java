class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store frequency key → list of anagrams
        Map<String, List> map = new HashMap();
        
        for(String s : strs) {
            // Create a frequency bucket of size 26 (one slot per alphabet letter)
            int[] count = new int[26];
            // Count frequency of each character in the current word
            for(char c : s.toCharArray()) {
                // 'a' maps to index 0, 'b' to 1, ..., 'z' to 25
                count[c - 'a']++;
            }
            // Build a unique key from the frequency array
            StringBuilder sb = new StringBuilder();
            for(int i : count) {
                // '#' acts as separator to avoid collision between numbers
                // e.g. counts [1,2] and [12] would look same without '#'
                sb.append("#");
                sb.append(i);
            }
            // Convert StringBuilder to String to use as HashMap key
            String key = sb.toString();
            // If this key is not in map yet, create a new empty list for it
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            // Add current word to its anagram group
            map.get(key).add(s);
        }
        // Return all anagram groups as a list of lists
        return new ArrayList(map.values());
    }
}
