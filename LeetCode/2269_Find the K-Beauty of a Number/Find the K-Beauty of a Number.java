class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int l = 0;
        int r = k-1;
        int count = 0;
        while(r < s.length())
        {
            int val = Integer.valueOf(s.substring(l,r+1));
            l++;
            r++;
            if(val == 0) continue;
            if(num % val == 0) count++;
        }
        return count;
    }
}
