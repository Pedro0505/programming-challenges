# https://leetcode.com/problems/valid-anagram/

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        a = list(s)
        a.sort()
        b = list(t)
        b.sort()
        return a == b
