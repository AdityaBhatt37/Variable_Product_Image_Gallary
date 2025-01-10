format_info = """
Code created by : Priyanshu Negi
Course: BCA
Section: F2
Semester: 4
Class Rollno: 34
"""

print(format_info)


num = int(input("Enter a number: "))

divisor_sum = 0


for i in range(1, num):
    if num % i == 0:
        divisor_sum += i


if divisor_sum == num:
    print("The number is a perfect number.")
else:
    print("The number is not a perfect number.")
