from typing import List


class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        nums.sort()
        ans = list()

        for n in range(len(nums)):
            if nums[n] == target:
                ans.append(n)

        return ans


a = Solution().targetIndices(nums=[1, 2, 5, 2, 3], target=2)

print(a)
