class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int arr[]=new int[nums.length];
        int ev=0;
        int od=n;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
             arr[i]=nums[ev];
             ev++;
            }
            else
            {
             arr[i]=nums[od];
             od++;
            }
        }   
        return arr;
    }
}