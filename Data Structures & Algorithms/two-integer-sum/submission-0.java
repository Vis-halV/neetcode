class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            set.put(nums[i],i);
        } 
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(set.containsKey(diff) && set.get(diff) != i) {
                return new int[]{i, set.get(diff)};
            }
        }
        return new int[0];
    }
}
