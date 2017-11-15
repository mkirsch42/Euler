from euler import num_divisors

V = 500
def run():
    next_add = 1
    tri_num = 0
    while True:
        tri_num += next_add
        next_add += 1
        if num_divisors(tri_num) >= V:
            return tri_num

if __name__ == "__main__":
    run()
