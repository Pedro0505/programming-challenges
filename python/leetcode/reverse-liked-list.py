from typing import Optional

# https://leetcode.com/problems/reverse-linked-list/


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        vals = list()

        self.get_val(head, vals)

        vals.reverse()

        self.changeLinkedList(head, vals, 0)

        return head

    def changeLinkedList(self, node, vals, index):
        if node is None:
            return

        if index == len(vals):
            return

        node.val = vals[index]

        return self.changeLinkedList(node.next, vals, index + 1)

    def get_val(self, node, vals):
        if node is None:
            return

        vals.append(node.val)

        return self.get_val(node.next, vals)
