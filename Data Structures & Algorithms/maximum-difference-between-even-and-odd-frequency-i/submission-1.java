class Solution {
    public int maxDifference(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[26];
        for (char c : chars){
            freq[c - 'a']++;
        }
        
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for (int i = 0; i < freq.length; i++){
            if (freq[i] == 0) continue;
            int cur = freq[i];
            if (cur % 2 == 0){
                if (cur < minEven) minEven = cur;
            } else {
                if (cur > maxOdd) maxOdd = cur;
            }
        }
        return maxOdd - minEven;
    }
}