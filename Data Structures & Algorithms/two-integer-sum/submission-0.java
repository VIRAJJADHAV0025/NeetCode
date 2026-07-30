class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number ->  its index
        Map <Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            // Calculate what number we need to reach the target
            int result = target - nums[i];
            //Check if that needed number was already seen
            if(map.containsKey(result)) {
                // Foumd the pair - return both indices
                // map.get(result) gives index of the complement
                // i is the index of current number
                return new int[] {map.get(result), i};
            }
            else {
                // Complement not found yet - store current number with its index
                map.put(nums[i], i);
            }
        }
        // No valid pair found - probelm guarantees this won't happen
        throw new IllegalArgumentException("No match");
    }
}
