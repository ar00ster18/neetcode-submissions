class Solution {
    public int[] replaceElements(int[] arr) {
        int endIndex = arr.length - 1;
        int maxToRight = arr[endIndex];
        arr[endIndex] = -1;
        for (int i = endIndex - 1; i >= 0; i--){
            int temp = maxToRight;
            maxToRight = Math.max(maxToRight, arr[i]); // cleaner than the if block
            arr[i] = temp;
        }
        return arr;
    }
}