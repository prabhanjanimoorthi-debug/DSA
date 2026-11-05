class Solution {
    public int maxProduct(int[] nums) {
         int curr=nums[0];
         int curr1=nums[0];
         int maxe=nums[0];
         for(int i=1;i<nums.length;i++)
         {
            if(nums[i]<0)
            {
                int temp=curr1;
                curr1=curr;
                curr=temp;
            }
             curr=Math.max(nums[i],curr*nums[i]);
             curr1=Math.min(nums[i],curr1*nums[i]);
             maxe=Math.max(maxe,curr);
         }
         return maxe;
    }
}