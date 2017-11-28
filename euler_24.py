V = 1000000

def price_is_right_factorial(n):
    base = 1
    fac = 1
    while fac < n:
        base += 1
        fac *= base
    return (base - 1, fac / base)

def run():
    perm = 0
    digits = list(range(10))
    rem = V - 1
    base, fac = price_is_right_factorial(rem)
    while rem > 0:
        group_idx = int(rem // fac)
        perm *= 10
        perm += digits.pop(group_idx)
        rem -= group_idx*fac
        fac /= base
        base -= 1
    for d in digits:
        perm *= 10
        perm += d
    return perm

if __name__ == "__main__":
    run()
