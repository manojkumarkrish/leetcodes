class Solution {
    public int missingNumber(int[] nums) 
    {
        int sum=0;
        int arrs=0;
        for(int i=0;i<=nums.length;i++)
        sum+=i;
        for(int i=0;i<nums.length;i++)
        arrs+=nums[i];
        return sum-arrs;
    }
}