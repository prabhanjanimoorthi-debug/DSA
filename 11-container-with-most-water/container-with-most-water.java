class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int curr=0;
        int minhe=Integer.MAX_VALUE;
        int maxarea=Integer.MIN_VALUE;
        while(left<right)
        {
            int wid=right-left;
            minhe=Math.min(height[left],height[right]);
            curr=wid*minhe;
            maxarea=Math.max(curr,maxarea);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxarea;
    }
}