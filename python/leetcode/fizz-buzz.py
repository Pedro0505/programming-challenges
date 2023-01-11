from typing import List


class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        lst = list()
        lst.append("1")
        lst.append("2")

        for i in range(3, n + 1):
            if i % 3 == 0 and i % 5 == 0:
                lst.append("FizzBuzz")
            elif i % 3 == 0:
                lst.append("Fizz")
            elif i % 5 == 0:
                lst.append("Buzz")
            else:
                lst.append(str(i))

        return lst
