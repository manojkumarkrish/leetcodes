class Solution {
    public int alternatingSum(int[] nums)
    {
        int pos=nums.length;
        int sum=0;
        int st=0;
        while(pos>1)
        {
         sum+=(nums[st]-nums[st+1]);
         pos=pos-2;
         st=st+2;
        }
        if(pos==1)
        {
            sum+=nums[st];
        }
        return sum;
    }
}