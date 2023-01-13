from typing import List

# https://leetcode.com/problems/longest-common-prefix/description/


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()

        first = strs[0]
        last = strs[-1]

        for i, char in enumerate(first):
            if char != last[i]:
                return first[:i]

        return first
