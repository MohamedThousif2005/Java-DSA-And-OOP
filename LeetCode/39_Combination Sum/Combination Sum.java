class Solution {
    static void combination(int ind,int target,List<Integer> list,List<List<Integer>> ans,int a[])
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(ind == a.length)
        {
            if(target==0) ans.add(new ArrayList<>(list));
            return;
        }
        if(a[ind]<=target)
        {
        list.add(a[ind]);
        combination(ind,target-a[ind],list,ans,a);
        list.remove(list.size()-1);
        }
        combination(ind+1,target,list,ans,a);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combination(0,target,list,ans,candidates);
        return ans;
    }
}
