def exponent (base, count):
    if count == 1:
        return base
    else:
        return base * factorial(base, count-1)


print(exponent(2, 4)) #expect 
