from euler import prime_factors

def run():
    max_f = {}
    for i in range(2, 21):
        factors = prime_factors(i)
        for n, c in factors.items():
            if n not in max_f or c > max_f[n]:
                max_f[n] = c
    prod = 1
    for n, c in max_f.items():
        prod *= n**c
    return prod

if __name__ == "__main__":
    run()
