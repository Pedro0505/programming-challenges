from typing import Optional


# https://leetcode.com/problems/same-tree/

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if p is None and q is None:
            return True

        if p is not None and q is not None:
            return (
                (p.val == q.val) and
                self.isSameTree(p.left, q.left) and
                self.isSameTree(q.right, p.right)
            )

        return False
