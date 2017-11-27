from math import factorial as fac

V = 20

def run():
    return fac(V*2) / (fac(V)**2)

if __name__ == "__main__":
    run()
