class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int ch=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]!=val)
            {
                nums[ch]=nums[i];
                ch++;
            }
        }
        return ch;
    }
}