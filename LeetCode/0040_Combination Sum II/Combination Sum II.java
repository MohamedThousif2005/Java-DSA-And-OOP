class Solution {
    static void combination(int n,int t,List<Integer> l,int a[],List<List<Integer>> ans)
    {
        if(t==0)
        {
         ans.add(new ArrayList<>(l));
         return;
        }

        for(int i=n;i<a.length;i++)
        {  
            if(i>n && a[i]==a[i-1]) continue;
            if(a[i] > t) break;
            l.add(a[i]);
            combination(i+1,t-a[i],l,a,ans);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,target,list,candidates,ans);
        return ans;
    }
}
