from euler import sieve

V = 2000000
def run():
    primes = sieve(V)
    primes.invert()
    sum = 0
    p = 2
    while p < V:
        sum += p
        try:
            p = primes.index(True, p+1)
        except ValueError:
            return sum
    return sum

if __name__ == "__main__":
    run()
