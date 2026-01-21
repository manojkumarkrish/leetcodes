class Solution {
    public String reversePrefix(String s, int k)
    {
        StringBuilder str=new StringBuilder();
        for(int i=k-1;i>=0;i--)
        {
            str.append(s.charAt(i));
        }
        for(int j=k;j<s.length();j++)
        {
            str.append(s.charAt(j));
        }
        return str.toString();
    }
}