from typing import Optional, List

# https://leetcode.com/problems/binary-tree-preorder-traversal/description/


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        transvesal = list()

        self.dsf(root, transvesal)

        return transvesal

    def dsf(self, node, transvesal):
        if node is not None:
            if node.val is not None:
                transvesal.append(node.val)

            self.dsf(node.left, transvesal)
            self.dsf(node.right, transvesal)
