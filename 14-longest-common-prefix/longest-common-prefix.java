class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length == 0) return "";
        int min=0;
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<strs[min].length())
            min=i;
        }
        String l=strs[min];
        int max=l.length();
        int mx=0;
        for(int i=0;i<strs.length;i++)
        {
            String v=strs[i];
            int ct=0;
            for(int j=0;j<max;j++)
            {
                if(v.charAt(j)==l.charAt(j))
                {
                    ct++;
                }
                else
                {
                    break;
                }
            }
            if(i==0)
                mx=ct;
            else
                mx=Math.min(mx,ct);
        }
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<mx;i++)
        {
            ans.append(l.charAt(i));
        }
        return ans.toString();
    }
}