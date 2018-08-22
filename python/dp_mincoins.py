def recMC (coinValueList, change):
    minCoins = change
    if change in coinValueList:
        return 1
    else:
        for i in [c for c in coinValueList if c <= change]:
            numCoins = 1 + recMC(coinValueList, change-i)
            if numCoins < minCoins:
                minCoins = numCoins
    return minCoins

def recMC_memoized (coinValueList, change, memo):
    minCoins = change
    if change in coinValueList:
        memo[change] = 1
        return 1
    if memo[change] > 0:
        return memo[change]
    else:
        for i in [c for c in coinValueList if c <= change]:
            numCoins = 1 + recMC_memoized(coinValueList, change-i, memo)
            if numCoins < minCoins:
                minCoins = numCoins
                memo[change] = minCoins
    return minCoins

#test
print(recMC_memoized([1, 5, 10, 25], 63, [0]*64))
