format_info = """
Code created by : Priyanshu Negi
Course: BCA
Section: F2
Semester: 4
Class Rollno: 34
"""

print(format_info)

num = int(input("Enter a number to find its factorial: "))

factorial = 1

if num < 0:
    print("Factorial is not defined for negative numbers.")
elif num == 0:
    print("Factorial of 0 is 1")
else:
    for i in range(1, num + 1):
        factorial *= i

    print("Factorial of", num, "is", factorial)
