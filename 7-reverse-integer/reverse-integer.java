class Solution {
    public int reverse(int n) 
    {
        int rev=0;
        int digit=0;
        if(n>0)
        {
           while(n>0)
           {
            digit=n%10;
            if (rev > Integer.MAX_VALUE / 10 ||
                   (rev == Integer.MAX_VALUE / 10 && digit > 7))
                    return 0;
           rev=rev*10+(n%10);
           n/=10;
           }
        }
        else if(n<0)
        {
           int p=Math.abs(n);
           while(p>0)
           {
            digit=p%10;
            if (rev > Integer.MAX_VALUE / 10 ||
                   (rev == Integer.MAX_VALUE / 10 && digit > 8))
                    return 0;
           rev=rev*10+(p%10);
           p/=10;
           }
           rev=(-rev);
        }
       return rev;
    }
}