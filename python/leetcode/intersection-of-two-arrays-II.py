from typing import List


class Solution:
    def hashMap(self, arr):
        mapping = dict()

        for n in arr:
            cast_n = str(n)
            if cast_n not in mapping:
                mapping[cast_n] = 1
            else:
                mapping[cast_n] += 1

        return mapping

    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        ans = list()

        n1 = self.hashMap(nums1)
        n2 = self.hashMap(nums2)

        for n in set(nums1):
            if str(n) in n2:
                num = n1[str(n)] if n1[str(n)] < n2[str(n)] else n2[str(n)]
                for x in range(num):
                    ans.append(n)

        return ans
