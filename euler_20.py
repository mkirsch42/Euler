from math import factorial

def run():
    k = factorial(100)
    s = 0
    while k > 0:
        s += k % 10
        k //= 10
    return s


if __name__ == "__main__":
    run()
