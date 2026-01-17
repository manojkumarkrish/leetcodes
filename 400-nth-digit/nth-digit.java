class Solution {
    public int findNthDigit(int n) {
        long count=9;
        long start=1;
        long len=1;
        while(n>len*count)
        {
            n-=len*count;
            count*=10;
            start*=10;
            len++;
        }
        long position= (n-1)/len;
        long index=  (n-1)%len;
        String s= ""+(start+position);
        return s.charAt( (int) index)-48;
    }
}