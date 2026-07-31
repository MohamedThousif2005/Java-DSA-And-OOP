class Solution {
    public int minimumRecolors(String blocks, int k) {
        int freq[] = new int[2];
        for(int i = 0; i < k; i++)
        {
            if(blocks.charAt(i) == 'W') freq[0]++;
            else freq[1]++;
        }
        int l = 0;
        int r = k;
        int minlen = freq[0];
        while(r < blocks.length())
        {
            if(blocks.charAt(l) == 'W') freq[0] -= 1;
            else freq[1] -= 1;
            if(blocks.charAt(r) == 'W') freq[0] += 1;
            else freq[1] += 1;
            minlen = Math.min(minlen,freq[0]);
            l++;
            r++;
        }
        return minlen;
    }
}
