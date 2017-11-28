digits = [0, 3, 3, 5, 4, 4, 3, 5, 5, 4]
teens = [3, 6, 6, 8, 8, 7, 7, 9, 8, 8]
tens = [0, 3, 6, 6, 5, 5, 5, 7, 6, 6]

def tens_len(n):
    if n < 10:
        return digits[n]
    if n < 20:
        return teens[n%10]
    return tens[n//10] + digits[n%10]

def word_len(n):
    s = 0
    if n >= 1000:
        s += digits[n//1000] + 8
    if n >= 100 and (n//100)%10 != 0:
        s += digits[(n//100)%10] + 7
        if n % 100 != 0:
            s += 3
    s += tens_len(n%100)
    return s

def run():
    s = 0
    for i in range(1000):
        s += word_len(i+1)
    return s


if __name__ == "__main__":
    run()
