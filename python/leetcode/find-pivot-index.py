from typing import List


class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            right = nums[i+1:]
            left = nums[:i]

            if sum(right) == sum(left):
                return i

        return - 1
