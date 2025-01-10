format_info = """
Code created by : Priyanshu Negi
Course: BCA
Section: F2
Semester: 4
Class Rollno: 34
"""

print(format_info)

num = input("Enter a number: ")


reverse_num = ""

for digit in num:
    reverse_num = digit + reverse_num


if num == reverse_num:
    print("The number is a palindrome.")
else:
    print("The number is not a palindrome.")
