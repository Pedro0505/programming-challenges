from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        vals = list()

        self.get_val(head, vals)

        reverse = list(reversed(vals))

        return vals == reverse

    def get_val(self, node, vals):
        if node is None:
            return

        vals.append(node.val)

        return self.get_val(node.next, vals)
