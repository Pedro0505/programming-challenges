from typing import Optional
from math import floor


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        node = head
        lst = list()

        while (node is not None):
            lst.append(node.val)

            node = node.next

        middle = lst[(floor(len(lst)/2)):]

        newHead = ListNode(middle[0])
        middle.pop(0)
        tail = newHead

        for n in middle:
            tail = ListNode(n)
            tail = tail.next

        return newHead


def showResult(head):
    node = head
    lst = list()

    while (node is not None):
        lst.append(node.val)

        node = node.next

    return lst
