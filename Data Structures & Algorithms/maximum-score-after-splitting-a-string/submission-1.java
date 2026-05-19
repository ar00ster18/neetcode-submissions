class Solution {
    public int maxScore(String s) {
        int zeros = 0, ones = 0, res = Integer.MIN_VALUE;
        // count total ones first
        for (char c : s.toCharArray()) if (c == '1') ones++;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') zeros++;
            else ones--;
            res = Math.max(res, zeros + ones);
        }
        return res;
    }
}