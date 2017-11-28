def leap(y):
    return y%4==0 and (y%100!=0 or y%400==0)

months = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
def days(m, y):
    if m == 1:
        if leap(y):
            return 29
        else:
            return 28
    return months[m]

def run():
    m = 0
    y = 1900
    d = 1
    s = 0
    while y == 1900:
        d += days(m, y)
        d %= 7
        m += 1
        if m == 12:
            m = 0
            y += 1
    while y <= 2000:
        d += days(m, y)
        d %= 7
        if d == 0:
            s += 1
        m += 1
        if m == 12:
            m = 0
            y += 1
    return s


if __name__ == "__main__":
    run()
