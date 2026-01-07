class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int arr[]=new int[nums1.length+nums2.length];
        double val=0;
        for(int i=0;i<nums1.length;i++)
        arr[i]=nums1[i];
        int k=0;
        for(int i=nums1.length;i<nums1.length+nums2.length;i++)
        {
         arr[i]=nums2[k];
         k++;
        }
        
        Arrays.sort(arr);
        if(arr.length%2==0)
        {
            int mid=arr.length/2;
            val=(arr[mid]+arr[mid-1])/2.0;
        }
        else
        {
            int mid=arr.length/2;
            val=arr[mid];
        }
        return val;
        
    }
}