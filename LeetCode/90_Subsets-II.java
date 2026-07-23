class Solution {
    static void backtrack(int ind, List<List<Integer>> ans, List<Integer> list, int nums[])
    {
        ans.add(new ArrayList<>(list));
        for(int i = ind; i < nums.length; i++)
        {
            if(i > ind && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            backtrack(i+1, ans, list, nums);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, ans, new ArrayList<>(), nums);
        return ans;
    }
}
