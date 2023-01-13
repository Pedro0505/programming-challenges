from typing import Optional

# https://leetcode.com/problems/reverse-linked-list/


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        lst = list()

        self.get_val(head, lst)

        lst.reverse()

        heads = ListNode(lst[0])
        lst.pop(0)
        node = heads

        for val in lst:
            node.next = ListNode(val)
            node = node.next

        return heads

    def get_val(self, node, lst):
        if node is None:
            return

        lst.append(node.val)

        return self.get_val(node.next, lst)
