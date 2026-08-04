class Solution {
    private int count;
    private String ans = "";
    private void backtrack(char[] charArray, boolean[] freqArray, int k, StringBuilder sb)
    {
        if (!ans.isEmpty()) return;
        if(sb.length() == charArray.length) 
        {
            count++;
            if(count == k)
            {
                ans = sb.toString();
            }
            return;
        }
        for(int i = 0; i < charArray.length; i++)
        {
            if(freqArray[i]) continue;
            freqArray[i] = true;
            sb.append(charArray[i]);
            backtrack(charArray, freqArray, k, sb);
            freqArray[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public String getPermutation(int n, int k) {
        char[] charArray = new char[n];
        for(int i = 0; i < n; i++)
        {
            charArray[i] = (char)('1' + i);
        }
        boolean[] freqArray = new boolean[n];
        backtrack(charArray, freqArray, k, new StringBuilder());
        return ans;
    }
}
