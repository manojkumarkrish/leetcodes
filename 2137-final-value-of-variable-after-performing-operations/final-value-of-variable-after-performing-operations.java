class Solution {
    public int finalValueAfterOperations(String[] operations) 
    {
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            String s=operations[i];
            char ch=s.charAt(1);
            if(ch=='+')
            {
                x++;
            }
            else if(ch=='-')
            {
                x--;
            }
        }
        return x;
    }
}