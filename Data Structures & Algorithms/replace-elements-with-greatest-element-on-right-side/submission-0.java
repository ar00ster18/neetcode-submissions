class Solution {
    public int[] replaceElements(int[] arr) {
        int endIndex = arr.length - 1;
        int maxToRight = arr[endIndex];
        arr[endIndex] = -1;
        for (int i = endIndex - 1; i >= 0; i--){
            int temp = maxToRight;
            if (arr[i] > maxToRight){
                maxToRight = arr[i];
            }
            arr[i] = temp;
        }
        return arr;
    }
}