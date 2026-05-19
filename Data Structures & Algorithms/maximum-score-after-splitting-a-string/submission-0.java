class Solution {
    public int maxScore(String s) {
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < s.length(); i++){
            int leftScore = s.substring(0, i).replace("1", "").length();
            int rightScore = s.substring(i).replace("0", "").length();
            if (res < leftScore + rightScore) res = leftScore + rightScore;
        }
        return res;
    }
}