class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long sum = 0;
        char ans[] = new char[shifts.length];
        for(int i = 0; i < shifts.length; i++)
        {
            sum += shifts[i];
        }
      
        for(int i = 0; i < s.length(); i++)
        {
            ans[i] = (char) ('a'+ ( s.charAt(i)- 'a' + sum) %26);
            sum-=shifts[i];
        }
        return new String(ans);
    }
}
