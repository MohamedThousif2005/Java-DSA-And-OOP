class Solution {
    static int minValue(int arr[])
    {
        if(arr[0] < arr[1] && arr[0] < arr[2]) return arr[0];
        else if(arr[1] < arr[2]) return arr[1];
        else return arr[2]; 
    }
    public int numberOfSubstrings(String s) {
        int count=0;
        int freqArray[] = {-1, -1, -1};
        int index = 0;
        while(index < s.length())
        {
           freqArray[s.charAt(index) - 'a'] = index;
           count += 1 + minValue(freqArray);
           index++;
        }
        return count;
    }
}
