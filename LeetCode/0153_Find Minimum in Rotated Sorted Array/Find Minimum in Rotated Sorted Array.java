class Solution {
    public int findMin(int[] nums) {
        int minElement = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < minElement) minElement = nums[i];
        }
        return minElement;
    }
}
