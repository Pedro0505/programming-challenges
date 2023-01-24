from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0

        lst = list()
        count = 0

        self.dsf(root, count, lst)

        return max(lst)

    def dsf(self, root, count, lst):
        if root is None:
            count = 0
            return

        count += 1
        lst.append(count)
        self.dsf(root.left, count, lst)
        self.dsf(root.right, count, lst)
