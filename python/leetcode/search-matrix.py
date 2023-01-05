def searchMatrix(matrix, target):
    for i in matrix:
        if target in i:
            return True

    return False
