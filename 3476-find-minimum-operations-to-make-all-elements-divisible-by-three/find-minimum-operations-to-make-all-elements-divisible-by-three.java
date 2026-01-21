class Solution {
    public int minimumOperations(int[] nums) 
    {
        int d=nums.length;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]%3==0)
        {
            d--;
        }
       }
       return d;
    }
}