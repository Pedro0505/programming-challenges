class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(self, list1: ListNode, list2: ListNode):
        if list1 is None and list2 is None:
            return list1

        fList = list()
        self.getVal(list1, fList)

        sList = list()
        self.getVal(list2, sList)

        merge = fList + sList

        merge.sort()

        head = ListNode(merge[0])
        merge.pop(0)
        tail = head

        for val in merge:
            tail.next = ListNode(val)
            tail = tail.next

        return head

    def getVal(self, node, lst):
        if node is None:
            return

        lst.append(node.val)

        return self.getVal(node.next, lst)
