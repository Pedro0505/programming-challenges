from typing import List


class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        lst = list()

        for n in nums:
            if n > 9:
                s = list(map(int, str(n)))
                lst += s
            else:
                lst.append(n)

        return sum(nums) - sum(lst)
