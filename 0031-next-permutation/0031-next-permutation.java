class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i;
        for(i=n-2;i>-1;i--)
        {
            if(nums[i]<nums[i+1])
            {
                break;
            }
        }
            if(i>=0)
            {
                for(int j=n-1;j>i;j--)
                {
                    if(nums[j]>nums[i]){
                    swap(nums,i,j);
                    break;
                    }
                }
            }
        reverse(nums,i+1,n-1);
    }
    public static void reverse(int[] nums,int i,int j)
    {
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}