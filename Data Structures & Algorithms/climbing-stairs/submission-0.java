class Solution {
    public int climbStairs(int n) {
        if(n <= 3) return n;
        int one = 1;
        int two = 1;
        int res = 0;
        for(int i = 0; i < n-1; i++) {
            res = one + two;
            one = two;
            two = res;
        }
        return res;
    }
}
