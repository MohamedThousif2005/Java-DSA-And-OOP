class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int left = 0;
        int right = 0;
        int tempLen = 0;
        int maxLen = 0;
        while(right < nums.length)
        {
            if(nums[right] == 0) zeroCount++;
            if(zeroCount > k)
            {
                if(nums[left] == 0) zeroCount--;
                left++;
            }
            tempLen = right - left + 1;
            maxLen = Math.max(tempLen, maxLen);
            right++;
        }
        return maxLen;
    }
}
