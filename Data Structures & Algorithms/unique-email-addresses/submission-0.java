class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++){
            int atIndex = emails[i].indexOf("@");
            String local = emails[i].substring(0, atIndex);
            String domain = emails[i].substring(atIndex + 1);
            int plusIndex = local.indexOf("+");
            String localNoPlus = (plusIndex == -1) ? local : local.substring(0, plusIndex);
            String cleanLocal = localNoPlus.replace(".", "");
            set.add(cleanLocal + "@" + domain);
        }
        return set.size();
    }
}