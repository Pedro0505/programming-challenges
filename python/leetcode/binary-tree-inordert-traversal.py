from typing import Optional, List

# https://leetcode.com/problems/binary-tree-inorder-traversal/description/


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []

        transvesal = list()

        self.dsf(root, transvesal)

        return transvesal

    def dsf(self, root, transvesal):
        if not root:
            return

        self.dsf(root.left, transvesal)
        transvesal.append(root.val)
        self.dsf(root.right, transvesal)
