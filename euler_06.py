def run():
    sum_squares = 0
    squared_sum = 0
    for i in range(101):
        sum_squares += i*i
        squared_sum += i
    squared_sum *= squared_sum
    return squared_sum - sum_squares

if __name__ == "__main__":
    run()
