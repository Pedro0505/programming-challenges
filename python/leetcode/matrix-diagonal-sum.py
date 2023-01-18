from typing import List


class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        ans = 0
        for i in range(len(mat)):
            ans = ans + mat[i][i] + mat[i][(len(mat) - 1) - i]

        if len(mat) % 2 != 0:
            s = mat[int(len(mat) / 2)][int(len(mat) / 2)]
            ans -= s

        return ans
