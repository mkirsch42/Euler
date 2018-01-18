from math import floor, sqrt

V = 1000

def run():
    r = floor(sqrt(4*V - 163))
    return int(-(r**3 + 163*r) / 4)


if __name__ == "__main__":
    run()
