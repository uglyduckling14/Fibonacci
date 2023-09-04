## Requirements
* In case of invalid parameters/ empty parameters give instructions
* Fibonacci sequence
  - Range is 0-40
  - returns Fn
* Factorial
  - Range is 0-Largest java integer
* E estimation
  - Range 1 - largest java integer
  - use taylor series

## Pseudocode

### public main:
    print out instructions
    if no arguments:
        print out instructions
    if invalid arguments:
        say invalid arguments + help
    if -fib:
        check for valid integer
        fibonnaci method
    if -fac:
        check for valid integer
        factorial method
    if -e:
        check for valid integer
        calculate e method
### private checkInt: bool
    return error handling if not an integer/ in range
    else return true
### private fibonnaci: int
    if n<=1:
        return n
    return fibonnaci(n-1) + fibonnaci(n-2)
### private factorial: int
    if n==0:
        return 1
    return factorial(n-1) * factorial(n-2)
### private e: double
    if n==0:
        return 1
    return e(n-1)/n-1 + e(n-2)/n-2