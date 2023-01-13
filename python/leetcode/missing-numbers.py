from typing import List

# https://leetcode.com/problems/missing-number/submissions/877400876/


class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        lst = list()

        for i in range(len(nums)):
            lst.append(i)

        set_list = list(set(lst) - set(nums))

        if len(set_list) == 0:
            sorted(lst)

            return lst[-1] + 1

        return list(set_list)[0]
