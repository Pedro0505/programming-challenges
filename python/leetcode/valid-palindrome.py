import re

# https://leetcode.com/problems/valid-palindrome/


class Solution:
    def isPalindrome(self, s: str) -> bool:
        result = re.sub(r'[^a-zA-Z0-9]', '', s)
        lower = result.lower()

        return lower == lower[::-1]
