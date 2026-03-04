class Solution {
    public boolean canJump(int[] nums) 
    {
        int n=nums.length;
        int pos=0;
        
        for(int i=0;i<n;i++)
        {
            if(i>pos)
            {
                return false;
            }
            pos=Math.max(pos,nums[i]+i);
        }
        return true;
    }
}