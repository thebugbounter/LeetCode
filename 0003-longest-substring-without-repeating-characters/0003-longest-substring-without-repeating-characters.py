class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = dict()
        i = 0
        maxLen = 0
        for j, char in enumerate(s):
            if char in seen:
                i = max(i, seen[char])
            seen[char] = j + 1
            maxLen = max(maxLen, j - i + 1)
            
        return maxLen