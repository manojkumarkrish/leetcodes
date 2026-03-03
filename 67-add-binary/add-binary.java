class Solution {
    public String addBinary(String a, String b) 
    {
        StringBuilder s=new StringBuilder();
        int al=a.length()-1;
        int bl=b.length()-1;
        int carry=0;
       while(al>=0||bl>=0||carry>0)
       {
        int sum=carry;
        if(al>=0)
        {
            sum+=(a.charAt(al)-'0');
            al--;
        }
        if(bl>=0)
        {
            sum+=(b.charAt(bl)-'0');
            bl--;
        }
        s.append(sum%2);
        carry=sum/2;
       }
       return s.reverse().toString(); 
    }
}