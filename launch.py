import importlib
import time

if __name__ == "__main__":
    problem = '%02d' % int(input("Euler #"))
    module = importlib.import_module(f"euler_{problem}")
    t = 0.0
    s = 0
    for i in range(10):
        a = time.perf_counter()
        s = module.run()
        t += 1000 * (time.perf_counter() - a)
    print(f"Answer: {s}")
    print(f"Average Time: {t/10} ms")
    module.run()
