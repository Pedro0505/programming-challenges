from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        for n in set(nums):
            half = len(nums) / 2
            rounded = half if len(nums) % 2 == 0 else half + 0.5
            if nums.count(n) >= rounded:
                return n
