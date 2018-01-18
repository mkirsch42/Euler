def cycle_len(n):
    history = {}
    rem = 1
    idx = 0
    while rem != 0:
        while rem < n:
            rem *= 10
            idx += 1
        if rem in history:
            return idx - history[rem]
        history[rem] = idx
        rem = rem % n
    return 0
        
V = 1000

def run():
    max = -1
    max_denom = -1
    for d in range(2, V):
        l = cycle_len(d)
        if l > max:
            max = l
            max_denom = d
    return max_denom

if __name__ == "__main__":
    run()
