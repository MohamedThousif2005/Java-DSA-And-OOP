class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length() > s.length()) return list;
        int freqArray[] = new int[26];
        for(char ch:p.toCharArray())
        {
            freqArray[ch - 'a']++;
        }
        int left = 0;
        int right = p.length();
        int freqArrayP[] = new int[26];
        for(int i = left; i < right; i++)
        {
            freqArrayP[s.charAt(i) - 'a']++;
        }
        while(right < s.length())
        {
               if(Arrays.equals(freqArray, freqArrayP)) list.add(left);
               freqArrayP[s.charAt(left) - 'a']--;
               freqArrayP[s.charAt(right) - 'a']++;
               left++;
               right++;
        }
        if(Arrays.equals(freqArray, freqArrayP)) list.add(left);
        return list;
    }
}
