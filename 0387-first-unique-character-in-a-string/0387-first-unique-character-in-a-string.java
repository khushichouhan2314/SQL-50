class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> rep = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set1.contains(c)) {
                rep.add(c);
            } else {
                set1.add(c);

            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set1.contains(c) && !rep.contains(c)) {
                return i;
            }
        }
        return -1;

    }

}