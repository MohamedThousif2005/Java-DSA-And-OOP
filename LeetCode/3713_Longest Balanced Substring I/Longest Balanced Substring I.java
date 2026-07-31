class Solution {
    static boolean fre(String s)
    {
        int freq[] = new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        int val = freq[s.charAt(0)-'a'];
        for(int i = 0; i < 26; i++)
        {
            if(freq[i] != val && freq[i] != 0) return false; 
        }
        return true;
    }
    public int longestBalanced(String s) {
        int maxLen = 0;
        if(s.length() == 1) return 1;
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = i+1; j < s.length(); j++)
            {
                String str = s.substring(i,j+1);
                if (maxLen < str.length() && fre(str))
                {
                    maxLen = str.length();
                }
            }
        }
        return maxLen;
    }
}
