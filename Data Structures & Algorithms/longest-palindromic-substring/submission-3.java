class Solution {
    public String longestPalindrome(String s) {
    String res = "";
    
    for (int i = 0; i < s.length(); i++) {
        // odd length palindromes (e.g. "aba")
        String odd = expand(s, i, i);
        if (odd.length() > res.length()) res = odd;
        
        // even length palindromes (e.g. "abba")
        String even = expand(s, i, i + 1);
        if (even.length() > res.length()) res = even;
    }
    return res;
}

private String expand(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
    }
    return s.substring(left + 1, right);
}
}
