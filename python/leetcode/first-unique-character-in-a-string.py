# https://leetcode.com/problems/first-unique-character-in-a-string/description/

class Solution:
    def firstUniqChar(self, s: str) -> int:
        splited = list(s)

        for i, char in enumerate(splited):
            if s.count(char) == 1:
                return i

        return -1
