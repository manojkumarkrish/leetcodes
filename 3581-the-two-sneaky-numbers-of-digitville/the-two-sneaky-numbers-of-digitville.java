class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {
     
     int pos=0;
     Arrays.sort(nums);
     for(int i=0;i<nums.length-1;i++)
     {
        if(nums[i]==nums[i+1])
        {
         nums[pos]=nums[i];
         pos++;
        }
     }
     int arr[]=new int[pos];
     for(int i=0;i<pos;i++)
     {
        arr[i]=nums[i];
     }
     return arr;
    }
}