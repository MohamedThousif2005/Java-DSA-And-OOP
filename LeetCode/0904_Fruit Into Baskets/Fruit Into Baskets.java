class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> fruitsMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        while(right < fruits.length)
        {
            fruitsMap.put(fruits[right], fruitsMap.getOrDefault(fruits[right], 0) + 1);
            if(fruitsMap.size() > 2)
            {
                if(fruitsMap.get(fruits[left]) == 1) fruitsMap.remove(fruits[left]);
                else fruitsMap.put(fruits[left], fruitsMap.get(fruits[left]) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
