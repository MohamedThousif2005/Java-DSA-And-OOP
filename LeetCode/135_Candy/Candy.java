class Solution {
    public int candy(int[] r) {
        int n = r.length;
        int a[] = new int[n];
        if(n==1) return 1;
        Arrays.fill(a,1);
        for(int i=1;i<n;i++)
        {
            if(r[i]>r[i-1]) a[i] = a[i-1]+1;
        }
        for(int i=n-2;i>=0;i--)
        {
            if(r[i]>r[i+1])
            {
                a[i] = Math.max(a[i],a[i+1]+1);
            }
        }
        int count = 0;
        for(int i:a) count+=i;
        return count;
    }
}
