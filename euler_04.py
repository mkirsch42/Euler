import math

def make_palindrome(left):
    s = left
    while left > 0:
        s *= 10
        s += left % 10
        left //= 10
    return s

def is_3digit_product(n):
    x = math.floor(math.sqrt(n))
    for i in range(100, x+1):
        if n%i == 0 and 99 < n/i < 1000:
            return True
    return False

def run():
    n = 999
    while n > 1:
        if is_3digit_product(make_palindrome(n)):
            return make_palindrome(n)
        n -= 1