class Solution {
    public int climbStairs(int n) 
    {
        int ct=0;
        int a=1;
        int b=1;
        if(n==0||n==1)
        {
            return 1;
        }
        for(int i=1;i<n;i++)
        {
           int t=a+b;
           a=b;
           b=t;
           ct=b;
        }
      return ct;
    }
}