class Solution
{
    public String categorizeBox(int length, int width, int height, int mass)
    {
        int bul = (int) Math.pow(10, 4);
        long vol = (long) length * width * height;
        int val = (int) Math.pow(10, 9);

        if ((length >= bul || width >= bul || height >= bul || vol >= val) && mass >= 100)
        {
            return "Both";
        }
        else if (length >= bul || width >= bul || height >= bul || vol >= val)
        {
            return "Bulky";
        }
        else if (mass >= 100)
        {
            return "Heavy";
        }
        else
        {
            return "Neither";
        }
    }
}
