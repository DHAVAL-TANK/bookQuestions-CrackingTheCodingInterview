class rotateMatrix:
    def rotate_matrix(matrix):

        matrix = [ list(row) for row in zip(*matrix)]

        matrix = [row[::-1] for row in matrix]

        return matrix
    
    matrix = [[1,2,3],[4,5,6],[7,8,9] ]
    rotated_matrix = rotate_matrix(matrix)
    for row in rotated_matrix:
        print(row)
        