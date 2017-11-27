V = 1000000

def chain_len(n, memo):
    if n in memo:
        return n
    s = 0
    if n % 2 == 0:
        s = 1 + chain_len(n/2, memo)
    else:
        s = 1 + chain_len(3*n+1, memo)
    memo[n] = s
    return s

def run():
    memo = {1: 1}
    longest = -1
    num = -1
    for i in range(2, V):
        s = chain_len(i, memo)
        if s > longest:
            num = i
            longest = s
    return num


if __name__ == "__main__":
    run()
