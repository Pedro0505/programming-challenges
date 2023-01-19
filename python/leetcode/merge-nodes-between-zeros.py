from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        ans = list()
        n = 0
        node = head.next

        while(node is not None):
            if node.val != 0:
                n += node.val
            else:
                ans.append(n)
                n = 0

            node = node.next

        heads = ListNode(ans[0])
        ans.pop(0)
        node = heads
        for val in ans:
            node.next = ListNode(val)
            node = node.next

        return heads
