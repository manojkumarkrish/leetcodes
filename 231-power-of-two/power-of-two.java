class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        boolean s=((n>0)&&(n&(n-1))==0);
        return s;
    }
}