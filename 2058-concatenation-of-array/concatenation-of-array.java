class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        for(int j=nums.length;j<nums.length*2;j++)
        {
            arr[j]=nums[j-nums.length];
        }
        return arr;
    }
}