class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;
        double avgVal = 0;
        int left = 0;
        int right = k;
        for(int i = 0; i < k; i++)
        {
            maxAvg += nums[i];
        }
        avgVal = maxAvg;
        maxAvg/=k;
        while(right < nums.length)
        {
           avgVal -= nums[left];
           avgVal += nums[right];
           maxAvg = Math.max(maxAvg, (avgVal/k));
           left++;
           right++;
        }
        return maxAvg;
    }
}
