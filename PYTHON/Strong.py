format_info = """
Code created by : Aditya Prasad Bhatt
Course: BCA
Section: f2
Semester: 4
Class Rollno: 3
"""

print(format_info)

num = int(input("Enter a number: "))


digit_sum = 0
temp = num

while temp > 0:
    digit = temp % 10
    factorial = 1
    for i in range(1, digit + 1):
        factorial *= i
    digit_sum += factorial
    temp //= 10


if digit_sum == num:
    print("The number is a strong number.")
else:
    print("The number is not a strong number.")
