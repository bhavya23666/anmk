import math

def is_strong_number(num):
    """
    Checks if a given number is a strong number.
    """
    if num < 0:
        return False
    
    original_num = num
    sum_of_factorials = 0
    
    # Calculate factorial of digits and sum them
    while num > 0:
        digit = num % 10
        sum_of_factorials += math.factorial(digit)
        num //= 10
        
    return sum_of_factorials == original_num

print("Strong numbers between 1 and 5000:")
for i in range(1, 5001):
    if is_strong_number(i):
        print(i)