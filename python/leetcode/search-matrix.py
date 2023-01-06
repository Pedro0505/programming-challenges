# https://leetcode.com/problems/search-a-2d-matrix/submissions/872262777/

def searchMatrix(matrix, target):
    for i in matrix:
        if target in i:
            return True

    return False
