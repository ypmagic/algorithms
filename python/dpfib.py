def fib (n):
    if n == 1 or n == 2:
        result = 1
    else:
        result = fib(n-1) + fib(n-2)
    return result

def fibMemo (n, memo):
    if memo[n] != null:
        return memo[n]
    if n == 1 or n == 2:
        result = 1
    else:
        result = fib(n-1) + fib(n-2)
    memo[n] = result
    return result

def fibBottomUp (n):
    if n == 1 or n == 2:
        return 1
    bottomUp = [] * (n+1)
    bottomUp[1] = 1
    bottomUp[2] = 1
    for i in range(3, n+1):
        bottomUp[i] = bottomUp[i-1] + bottomUp[i-2]
    return bottomUp[n]
