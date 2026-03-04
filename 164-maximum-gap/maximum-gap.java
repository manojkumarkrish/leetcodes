class Solution {
    public int maximumGap(int[] nums) 
    {
        int n=nums.length;
        int max=0;
        if(n==0||n==1) return 0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {
            int temp=nums[i+1]-nums[i];
            if(temp>max)
            {
                max=temp;
            }
        }
        return max;
    }
}