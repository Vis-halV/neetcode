class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int res = 1; int lres = 1;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] - nums[i-1] == 1) lres++;
            else {
                res = Math.max(res, lres);
                lres = 1;
            }
        }
        return Math.max(lres, res);
    }
}
