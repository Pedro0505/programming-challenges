class Solution:
    def sortSentence(self, s: str) -> str:
        splited = s.split(' ')
        lst = splited.copy()
        for i in splited:
            n = int(i[-1])

            lst[n - 1] = i[:-1]

        return " ".join(lst)
