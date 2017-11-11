import math
import numpy as np

def check_prime(n):
    if n == 1:
        return False
    if n < 4:
        return True
    if n%2 == 0:
        return False
    if n < 9:
        return True
    if n%3 == 0:
        return False
    
    r = math.floor(math.sqrt(n))
    for f in np.arange(5, r+1, 6):
        if n%f == 0 or n%(f+2) == 0:
            return False
    return True