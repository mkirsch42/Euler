V = 1001

def run():
    sum = 1
    shells = int((V - 1) / 2)
    prev = 1
    for shell in range(shells):
        for i in range(4):
            prev += 2*(shell+1)
            sum += prev
    return sum

if __name__ == "__main__":
    run()
