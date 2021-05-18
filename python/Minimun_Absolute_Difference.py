def minimumAbsoluteDifference(arr):
    menor_diff = 999
    for i in range(0, len(arr) - 1):
        for j in range(i+1, len(arr)):
            diff = abs(arr[i] - arr[j])
            if diff < menor_diff:
                menor_diff = diff

    print(menor_diff)

   

arr = [1,-3,71,68,17]

minimumAbsoluteDifference(arr)