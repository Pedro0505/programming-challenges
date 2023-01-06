# https://leetcode.com/problems/add-two-numbers/submissions/872914121/

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def addTwoNumbers(l1, l2):
    first_link_value = ''
    second_link_value = ''

    while(l1 is not None):
        if l1 is not None:
            first_link_value = str(l1.val) + first_link_value

            l1 = l1.next

    while(l2 is not None):
        second_link_value = str(l2.val) + second_link_value

        l2 = l2.next

    sum = int(first_link_value) + int(second_link_value)

    new_linked_values = list(map(int, str(sum)))

    if len(new_linked_values) == 1:
        return ListNode(new_linked_values[0], None)

    new_linked_values.reverse()

    new_linked_list = ListNode(new_linked_values[0])
    new_linked_values.pop(0)
    node = new_linked_list
    for val in new_linked_values:
        node.next = ListNode(val)
        node = node.next

    return new_linked_list
