import math
import numpy as np
from bitarray import bitarray

def check_prime(n):
    if n == 1:
        return False
    if n < 4:
        return True
    if n%2 == 0:
        return False
    if n < 9:
        return True
    if n%3 == 0:
        return False
    
    r = math.floor(math.sqrt(n))
    for f in np.arange(5, r+1, 6):
        if n%f == 0 or n%(f+2) == 0:
            return False
    return True

def sieve(n):
    comp = (n+1) * bitarray([False])
    comp[:2] = True
    p = 2
    s = math.sqrt(n)
    while p <= s:
        for i in np.arange(p*p, n+1, p):
            comp[i] = True
        p = comp.index(False, p+1)
    return comp

def prime_factors(n):
    factors = {}
    i = 2
    while n != 1:
        if n%i == 0:
            c = 0
            while n%i == 0:
                n /= i
                c += 1
            factors[i] = c
        i += 1
    return factors

def num_divisors(n):
    fac = prime_factors(n)
    count = 1
    for n in fac.values():
        count *= n + 1
    return count
