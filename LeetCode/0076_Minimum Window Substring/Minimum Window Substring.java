class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int freqArray[] = new int[125];
        int count = 0;
        int minWindow = s.length() + 5;
        int startIndex = -1;
        for(char ch:t.toCharArray())
        {
            freqArray[ch]++;
        }
        while(right < s.length())
        {
           if(freqArray[s.charAt(right)] > 0) count++;
           freqArray[s.charAt(right)]--;
           while(count == t.length())
           {
            if(right - left + 1 < minWindow)
            {
                minWindow = right - left + 1;
                startIndex = left;
            }
            freqArray[s.charAt(left)]++;
            if(freqArray[s.charAt(left)] > 0) count--;
            left++;
           }
           right++;
        }
        if(startIndex == -1) return "";
        return s.substring(startIndex, startIndex + minWindow);
    }
}
