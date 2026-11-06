class Solution {
    public boolean canJump(int[] nums) {
       int maxv=0;
       for(int i=0;i<nums.length;i++)
       {
           if(maxv<i)
           return false;
           maxv=Math.max(maxv,i+nums[i]);
       } 
       return true;
    }
}