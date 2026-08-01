class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
            if(nums[i]<=9) continue;
            int val = nums[i];
            int rev = 0;
            while(val!=0)
            {
                int l = val%10;
                rev=rev*10+l;
                val/=10;
            }
            set.add(rev);
        }
        return set.size();
    }
}
