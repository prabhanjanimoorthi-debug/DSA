class Solution {

    public int[] sortedSquares(int[] nums) {

        int i;
        int j;
        int n = nums.length;

        for (i = 0; i < n; i++) {
            nums[i] = (int)Math.pow(nums[i], 2);
        }

        for (i = 0; i < n - 1; i++) {

            for (j = i + 1; j < n; j++) {

                if (nums[i] > nums[j]) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}