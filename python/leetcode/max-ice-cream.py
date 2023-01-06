# https://leetcode.com/problems/maximum-ice-cream-bars/submissions/872744508/

def maxIceCream(costs, coins):
    costs.sort()

    price = 0
    count = 0

    for p in costs:
        price += p
        if not price > coins:
            count += 1

    return count
