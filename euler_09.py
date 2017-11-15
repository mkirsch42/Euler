import math

V = 1000
def run():
    for c in range(math.floor(V/3), V+1):
        rem = V - c
        a = rem // 2
        b = rem - a
        while b >= 0:
            if a*a + b*b == c*c:
                return a*b*c
            a += 1
            b -= 1
    return -1

if __name__ == "__main__":
    run()
