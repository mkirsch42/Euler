import euler
import math

V = 600851475143

def run():
    n = math.floor(math.sqrt(V))
    if n%2 == 0: n -= 1

    while n > 1:
        if V % n == 0 and euler.check_prime(n):
            return n
        n -= 2
        
if __name__ == "__main__":
    run()
