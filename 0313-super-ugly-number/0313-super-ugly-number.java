class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {

        int m=primes.length;
        int[] dp=new int[n];
        int[] idx=new int[m];
        long[] next=new long[m];
        dp[0]=1;
        for (int i=0;i<m;i++) {
            next[i]=primes[i];
        }
        for (int i=1;i<n;i++) {
            long min =Long.MAX_VALUE;
            for (long val :next) {
                min = Math.min(min,val);
            }
            dp[i] = (int) min;
            for (int j=0;j < m;j++) {
                if (next[j] ==min) {
                    idx[j]++;
                    next[j] = (long) dp[idx[j]] * primes[j];
                }
            }
        }
        return dp[n-1];
    }
}