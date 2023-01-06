class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def addTwoNumbers(l1, l2):
    first_link = l1
    second_link = l2

    first_link_value = ''
    second_link_value = ''

    while(first_link is not None):
        if first_link is not None:
            first_link_value += str(first_link.val)

            first_link = first_link.next

    while(second_link is not None):
        second_link_value += str(second_link.val)

        second_link = second_link.next

    sum = int(first_link_value[::-1]) + int(second_link_value[::-1])

    new_linked_values = list(map(int, str(sum)))

    if len(new_linked_values) == 1:
        return ListNode(new_linked_values[0], None)

    new_linked_values.reverse()

    new_linked_list = ListNode(new_linked_values[0])
    new_linked_values.pop(0)
    node = new_linked_list
    for i, val in enumerate(new_linked_values):
        node.next = ListNode(val)
        node = node.next

    return node


l1 = ListNode(2, ListNode(4, ListNode(3, None)))

l2 = ListNode(5, ListNode(6, ListNode(4, None)))

addTwoNumbers(l1, l2)
