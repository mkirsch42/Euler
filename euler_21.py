from math import factorial, sqrt, floor

V = 10000

def div_sum(n):
    s = 0
    for i in range(1, floor(sqrt(n)) + 1):
        if n % i == 0:
            s += i + n / i
    return s - n

def run():
    memo = {}
    s = 0
    for i in range(2, V):
        ds = div_sum(i)
        if ds in memo and memo[ds] == i:
            s += ds + i
        else:
            memo[i] = ds
    return s

if __name__ == "__main__":
    run()
