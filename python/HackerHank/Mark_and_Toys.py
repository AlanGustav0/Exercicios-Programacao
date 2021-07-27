def maximumToys(prices, k):

    counting_toys = 0
    prices_sorted = sorted(prices)

    for price in prices_sorted:
        if (k - price) >= 0:
            k -= price
            counting_toys += 1
        else:
            break

    print(counting_toys)


prices = [1,12,5,111,200,1000,10]

k = 50

maximumToys(prices, k)

