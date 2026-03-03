class Solution {
    public int titleToNumber(String columnTitle) 
    {
        int ans=0;
        int a=columnTitle.length();
        for(int i=0;i<a;i++)
        {
            char c=columnTitle.charAt(i);
            int val=c-'A'+1;
            ans=ans*26+val;
        }
        return ans;
    }
}