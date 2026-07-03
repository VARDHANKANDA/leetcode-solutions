class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        mergeSort(nums,0,nums.length-1);
        int ans = 0;
        for (int i=1; i<nums.length;i++) {
            ans = Math.max(ans, nums[i] - nums[i-1]);
        }
        return ans;
    }
    private void mergeSort(int[] nums,int l,int r) {
        if (l >= r) {
            return;
        }
        int m = l+(r-l)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m + 1,r);
        merge(nums,l,m,r);
    }
    private void merge(int[] nums,int l,int m,int r) {
        int[] temp = new int[r-l+1];
        int i = l,j = m + 1,k = 0;
        while (i <= m && j <= r) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= m) {
            temp[k++] = nums[i++];
        }
        while (j <= r) {
            temp[k++] = nums[j++];
        }
        for (int x=0;x < temp.length; x++) {
            nums[l+x] = temp[x];
        }
    }
}