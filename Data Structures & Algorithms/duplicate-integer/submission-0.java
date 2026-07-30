class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Create a HashSet to track numbers we have already seen
        Set<Integer> intSet = new HashSet();
        for(int num : nums) {
            // If number already exists in set, duplicate found
            if(intSet.contains(num)) {
                return true;
            }
            // Number not seen yet — add it to the set
            intSet.add(num);
        }
        // No duplicate found after checking all numbers
        return false;
    }
}
