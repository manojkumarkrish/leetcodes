class Solution {
    public int subtractProductAndSum(int n) 
    {
        int sum=0;
        int pro=1;
        while(n>0)
        {
            int dg=n%10;
            sum+=dg;
            pro*=dg;
            n/=10;
        }
        return pro-sum;
        
    }
}