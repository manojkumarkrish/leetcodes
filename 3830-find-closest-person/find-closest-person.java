class Solution {
    public int findClosest(int x, int y, int z) 
    {
        int fi=0;
        int se=0;
        if(x>z)
        {
          fi=x-z;
        }
        else
        {
            fi=z-x;
        }
        if(y>z)
        {
            se=y-z;
        }
        else
        {
            se=z-y;
        }
        if(fi==se)
        return 0;
        else if(fi<se)
        return 1;
        else
        return 2;
    }
}