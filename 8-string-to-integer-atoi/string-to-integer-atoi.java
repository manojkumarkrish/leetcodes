class Solution{
    public int myAtoi(String s)
    {
        s=s.trim();
        if(s.length()==0)
        return 0;
        long nums=0;
        int sign=1;
        int pos=0;
        if(s.charAt(0)=='-')
        {
            sign=-1;
            pos++;
        }
        if(s.charAt(0)=='+')
        {
            pos++;
        }
        for(int i=pos;i<s.length();i++)
        {
            if((s.charAt(i)>='0')&&(s.charAt(i)<='9'))
            {
                int digit=s.charAt(i)-'0';
                if(nums>Integer.MAX_VALUE/10||(nums==Integer.MAX_VALUE/10&&((sign==1&&digit>7)||(sign==-1&&digit>8))))
                {
                    return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                nums=nums*10+digit;
            }
            else
            break;
        }
        return (int)(nums*sign);
    }
}
