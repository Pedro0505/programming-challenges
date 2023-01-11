from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        node = head
        l_vals = ""

        while(node is not None):
            l_vals += str(node.val)

            node = node.next

        return l_vals == l_vals[::-1]


a = Solution().isPalindrome(
    ListNode(1, ListNode(2, ListNode(2, ListNode(1))))
)

print(a)
