def find_primes_up_to_n(n):
    """
    Finds all prime numbers up to a given number n.
    """
    primes = []
    for num in range(2, n + 1):  # Start checking from 2 as 1 is not prime
        is_prime = True
        # Check for divisibility from 2 up to the square root of num
        # Optimizing the loop by checking up to int(num**0.5) + 1
        # This is because if a number 'num' has a divisor greater than its square root,
        # it must also have a divisor smaller than its square root.
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                is_prime = False
                break  # No need to check further if a divisor is found
        if is_prime:
            primes.append(num)
    return primes

# Get prime numbers from 1 to 100
prime_numbers_1_to_100 = find_primes_up_to_n(100)

# Print the found prime numbers
print("Prime numbers from 1 to 100 are:")
print(prime_numbers_1_to_100)