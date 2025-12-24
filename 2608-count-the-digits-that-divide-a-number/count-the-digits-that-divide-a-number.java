class Solution {
    public int countDigits(int num) 
    {
        int temp=num;
        int ct=0;
        while (temp>0)
        {
            int dg=temp%10;
            if(num%dg==0)
            ct++;
            temp=temp/10;
        } 
        return ct;  
    }
}