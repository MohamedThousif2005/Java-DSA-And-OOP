class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int loopRun = 0;
        int minMove = 0;
        int tempIndex = startIndex;
        while(loopRun < words.length)
        {
            if(tempIndex == words.length) tempIndex = 0;
            if(startIndex == -1) startIndex = words.length - 1;
            if(words[tempIndex].equals(target)) break;
            if(words[startIndex].equals(target)) break;
            minMove++;
            tempIndex++;
            startIndex--;
            loopRun++;
        }

        return minMove == words.length ? -1 : minMove;
    }
}
