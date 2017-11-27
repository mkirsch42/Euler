V = 2**1000

def run():
    s = 0
    k = V
    while k > 0:
        s += k % 10
        k //= 10
    return s


if __name__ == "__main__":
    run()
