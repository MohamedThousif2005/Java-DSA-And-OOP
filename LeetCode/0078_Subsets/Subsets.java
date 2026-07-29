class Solution {
    private static void subset(int ind, List<Integer> list, List<List<Integer>> ans, int arr[])
    {
        ans.add(new ArrayList(list));
        for(int i=ind;i<arr.length;i++)
        {
        list.add(arr[i]);
        subset(i+1, list, ans, arr);
        list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subset(0, new ArrayList<>(), ans, nums);
        return ans;
    }
}
