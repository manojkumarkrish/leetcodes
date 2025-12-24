class Solution {
    public int numberOfSteps(int num) 
    {
        int st=0;
        while(num>0)
        {
            if(num%2==0)
            {
                num/=2;
                st++;
            }
            else
            {
                num-=1;
                st++;
            }
        }  
        return st; 
    }
}