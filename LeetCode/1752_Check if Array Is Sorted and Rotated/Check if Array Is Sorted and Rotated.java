class Solution {
    static int[] rotateArray(int array[], int noOfRotate)
    {
        int tempArray[] = new int[array.length];
        int ind = 0;
        for(int i = noOfRotate; i < array.length; i++)
        {
            tempArray[ind++] = array[i];
        }
        for(int i = 0; i < noOfRotate; i++)
        {
            tempArray[ind++] = array[i];
        }
        return tempArray;
    }
    public boolean check(int[] nums) {
        if(nums.length <= 2) return true;
        int dupArray[] = nums.clone();
        Arrays.sort(dupArray);
        int arrayLength = nums.length;
        for(int i = 0; i < arrayLength; i++)
        {
            if(Arrays.equals(dupArray,rotateArray(nums,i))) return true;
        }
        return false;
    }
}
