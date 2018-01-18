from math import log10, ceil, floor

V = 1000
PHI = (1 + 5**0.5) / 2

def fib_dig(n):
    return ceil(n*log10(PHI) - log10(5)/2)

def run():
    n = floor((V + log10(5)/2)/log10(PHI))
    while fib_dig(n) >= V:
        n -= 1
    return n + 1

if __name__ == "__main__":
    run()
