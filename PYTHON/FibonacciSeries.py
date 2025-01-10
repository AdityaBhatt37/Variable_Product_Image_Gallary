format_info = """
Code created by : Priyanshu Negi
Course: BCA
Section: F2
Semester: 4
Class Rollno: 34
"""

print(format_info)

terms = int(input("Enter the number of terms for Fibonacci series: "))


a, b = 0, 1


print("Fibonacci series up to", terms, "terms:")
for _ in range(terms):
    print(a, end=" ")
    temp = a
    a = b
    b = temp + b
