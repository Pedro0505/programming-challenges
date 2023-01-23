from typing import List


class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        if n == 1:
            return 1

        if len(trust) == 0:
            return -1

        if len(trust) == 1:
            return trust[0][1]

        listA = [x[0] for x in trust]
        listB = [x[1] for x in trust]

        ans = -1

        for a in list(set(listB)):
            if a not in listA:
                ans = a

        if ans != -1:
            for p in range(1, n):
                if p != ans:
                    if [p, ans] not in trust:
                        return -1

        return ans
