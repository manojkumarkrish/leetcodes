class Solution {
    public double[] convertTemperature(double celsius) 
    {
         double[]dis;
         dis= new double[2];
         dis[0]=celsius+273.15;
         dis[1]=celsius*1.80+32.00;
         return dis;
    }
}