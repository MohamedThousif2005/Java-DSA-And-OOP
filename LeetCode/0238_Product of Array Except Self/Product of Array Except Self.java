class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length <= 1) return nums;
        int prodArray[] = new int[nums.length];
        prodArray[0] = 1;
        for(int i = 1; i < nums.length; i++)
        {
           prodArray[i] = prodArray[i - 1] * nums[i - 1];
        }
        int prodValue = 1;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            prodArray[i] *= prodValue;
            prodValue *= nums[i];
        }
        return prodArray;
    }
}
