format_info = """
Code created by : Priyanshu Negi
Course: BCA
Section: F2
Semester: 4
Class Rollno: 34
"""

print(format_info)

num = int(input("Enter a number: "))


num_digits = len(str(num))


sum = 0
temp = num


while temp > 0:
    digit = temp % 10
    sum += digit ** num_digits
    temp //= 10


if num == sum:
    print("The number is an Armstrong number.")
else:
    print("The number is not an Armstrong number.")


