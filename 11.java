class Solution 
{
    public int maxArea(int[] height) 
    {
        int l = 0, r = height.length-1;
        int WaterCapacity=0;
        int big = 0;
        while(l<r)
        {
             WaterCapacity = (r-l)* (Math.min(height[l], height[r]));
             big = Math.max(WaterCapacity,big);
            if (height[l] < height[r]) 
             l++ ; 
             else 
              r--;
        }
        return big;
    }
}