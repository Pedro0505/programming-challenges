from typing import List


class Solution:
    def findAndReplacePattern(self, words: List[str], pattern: str):
        lst = list()

        for word in words:
            if (self.isIsomorphic(pattern, word)):
                lst.append(word)

        return lst

    def isIsomorphic(self, s: str, t: str) -> bool:
        splited1 = list(s)
        splited2 = list(t)

        set1 = set(splited1)
        set2 = set(splited2)

        if len(set1) != len(set2):
            return False

        hashMap = dict()

        for i in range(len(s)):
            if splited1[i] not in hashMap:
                hashMap[splited1[i]] = splited2[i]

        for i in range(len(s)):
            s_char = splited1[i]
            if hashMap[s_char] != splited2[i]:
                return False

        return True
