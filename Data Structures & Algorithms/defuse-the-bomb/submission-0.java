class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k == 0) return res;
        for(int i = 0; i < n; i++) {
            int pos = 0;
            for(int j = 1; j <= Math.abs(k); j++) {
                if(k > 0) {
                    pos = (i + j) % n;
                } else {
                    pos = (i - j + n) % n;
                }
                res[i] += code[pos];
            } 
        }
        return res;
    }
}
