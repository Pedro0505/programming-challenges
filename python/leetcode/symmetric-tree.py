from typing import Optional

# https://leetcode.com/problems/symmetric-tree/


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.is_same(root.right, root.left)

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
