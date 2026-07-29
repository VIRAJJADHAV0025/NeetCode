class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Create a hashset to store integers
        Set<Integer> intSet = new HashSet();
        for(int num : nums) {
            if(intSet.contains(num)) {
                return true;
            }
            // Add num to hashset
            intSet.add(num);
        }
        return false;
    }
}