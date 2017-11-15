import math
import bitarray
from euler import sieve

V = 10001
def run():
    upper_bound = math.floor(V*math.log(V*math.log(V)))
    primes = sieve(upper_bound)
    primes.invert()
    n = 1
    p = 2
    while n != V:
        n += 1
        p = primes.index(True, p+1)
    return p

if __name__ == "__main__":
    run()
