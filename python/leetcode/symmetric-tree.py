from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        right = root.right
        left = root.left

        a = self.is_same(right, left)

        return a

    def is_same(self, q, p):
        if p is None and q is None:
            return True

        if p is not None and q is not None:
            return (
                (p.val == q.val) and
                self.is_same(p.left, q.right) and
                self.is_same(p.right, q.left)
            )

        return False
