class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int res = 1; 
        Arrays.sort(nums);

        int streak = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] - nums[i-1] == 1) streak++;
            else {
                res = Math.max(
                    res,
                    streak 
                );
                streak = 1;
            }

        }
        return Math.max(res, streak);
    }
}
