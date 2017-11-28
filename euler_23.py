from math import floor, sqrt

def div_sum(n):
    s = 1
    for i in range(2, floor(sqrt(n)) + 1):
        if n % i == 0:
            s += i
            if i != n / i:
                s += n / i
            if s > n:
                return s
    return s

def run():
    abundants = []
    sums = [False] * 28123
    for i in range(1, 28123):
        ds = div_sum(i)
        if ds > i:
            abundants.append(i)
            for j in abundants:
                if i+j >= 28123:
                    break
                sums[i+j] = True
    return sum([i for i, x in enumerate(sums) if not x])

if __name__ == "__main__":
    run()
