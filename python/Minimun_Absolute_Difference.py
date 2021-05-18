def minimumAbsoluteDifference(arr):
    arr.sort()
    min_diff = 10 ** 10

    for i in range(1, len(arr)):
        diff = abs(arr[i-1] - arr[i])
        if diff < min_diff:
            min_diff = diff

    print(min_diff)

   
arr = [1,-3,71,68,17]
minimumAbsoluteDifference(arr)