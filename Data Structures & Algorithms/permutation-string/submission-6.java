class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> hashs1 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            hashs1.put(c, hashs1.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int have = 0;
        int need = hashs1.size();
        int l = 0;

        for (int r = 0; r < s2.length(); r++) {

            char c = s2.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (hashs1.containsKey(c) &&
                window.get(c).equals(hashs1.get(c))) {
                have++;
            }

            if (r - l + 1 > s1.length()) {

                char leftChar = s2.charAt(l);

                if (hashs1.containsKey(leftChar) &&
                    window.get(leftChar).equals(hashs1.get(leftChar))) {
                    have--;
                }

                window.put(leftChar, window.get(leftChar) - 1);

                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }

                l++;
            }

            if (have == need && r - l + 1 == s1.length()) {
                return true;
            }
        }

        return false;
    }
}