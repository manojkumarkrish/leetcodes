class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int min=-1;
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target&&min==-1)
            {
                min=i;
                max=i;
            }
            else if(nums[i]==target)
            {
                max=i;
            }
        }
        int arr[]=new int[2];
        arr[0]=min;
        arr[1]=max;
        return arr;
    }
}