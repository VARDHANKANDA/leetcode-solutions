class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n =nums.length;
        int ans=0;
        for (int i=0;i<n;i++) {
            int c=0;
            for (int j=i;j<n;j++) {
                if (nums[j]==target) {
                    c++;
                }
                int len =j - i + 1;
                if (c*2 >len) {
                    ans++;
                }
            }
        }
        return ans;
    }
}