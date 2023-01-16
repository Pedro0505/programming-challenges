from typing import List


class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        ans = list()

        for i in range(len(nums)):
            ans.append(nums[nums[i]])

        return ans
