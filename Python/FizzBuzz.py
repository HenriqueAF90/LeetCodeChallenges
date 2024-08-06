

def fizzBuzz(n):
    fizzBuzz_array = []
    for value in range(1, n + 1):   
        if value % 5 == 0 and  value % 3 == 0:
            fizzBuzz_array.append("FizzBuzz")
        elif value % 5 == 0:
            fizzBuzz_array.append("Buzz")
        elif value % 3 == 0:
            fizzBuzz_array.append("Fizz")
        else:
            fizzBuzz_array.append(str(value))
    #print(fizzBuzz_array)
    return fizzBuzz_array

fizzBuzz(15)
