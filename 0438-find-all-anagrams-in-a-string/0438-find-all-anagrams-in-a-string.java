class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;
        int[] map = new int[128];
        for (char c : p.toCharArray()) {
            map[c]++;
        }
        // two pointers to track the window
        int left = 0, right = 0;
        char[] chars = s.toCharArray();
        int m = s.length(), n = p.length(), count = n;
        while (right < m) {
            if (map[chars[right++]]-- > 0) count--;
            if (count == 0) res.add(left);
            if (right - left == n && map[chars[left++]]++ >= 0) count++;
        }
        return res;
    }
}