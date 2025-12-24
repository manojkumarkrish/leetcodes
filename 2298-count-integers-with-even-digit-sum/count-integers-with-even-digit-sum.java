class Solution {
    public int countEven(int num) 
    {
        int ct=0;
        for(int i=1;i<=num;i++)
        {
            int sum=0;
            int temp=i;
            while(temp>0)
            {
                int dg=temp%10;
                sum+=dg;
                temp/=10;
            }
            if(sum%2==0)
            {
                ct++;
            }
        }
        return ct;
    }
}