class Solution {
    public int maximumWealth(int[][] accounts)
    {
        int max=0;
        for(int i=0;i<accounts.length;i++)
        {
            int l=accounts[i].length;
            int sum=0;
            for(int j=0;j<l;j++)
            {
                sum+=accounts[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}