# Arithmetic operators
a = 10
b = 3
print("Arithmetic operators:")
print("a + b =", a + b)
print("a - b =", a - b)
print("a * b =", a * b)
print("a / b =", a / b)
print("a // b =", a // b)
print("a % b =", a % b)
print("a ** b =", a ** b)

# Comparison operators
x = 5
y = 8
print("\nComparison operators:")
print("x == y is", x == y)
print("x != y is", x != y)
print("x < y is", x < y)
print("x > y is", x > y)
print("x <= y is", x <= y)
print("x >= y is", x >= y)

# Logical operators
p = True
q = False
print("\nLogical operators:")
print("p and q is", p and q)
print("p or q is", p or q)
print("not p is", not p)

# Bitwise operators
m = 7  # 0111 in binary
n = 3  # 0011 in binary
print("\nBitwise operators:")
print("m & n is", m & n)  # Bitwise AND
print("m | n is", m | n)  # Bitwise OR
print("m ^ n is", m ^ n)  # Bitwise XOR
print("~m is", ~m)        # Bitwise NOT
print("m << 1 is", m << 1)  # Left shift
print("m >> 1 is", m >> 1)  # Right shift

# Assignment operators
print("\nAssignment operators:")
x += 2
print("x += 2, x is now", x)
y -= 3
print("y -= 3, y is now", y)
a *= 5
print("a *= 5, a is now", a)

# Identity operators
list1 = [1, 2, 3]
list2 = [1, 2, 3]
print("\nIdentity operators:")
print("list1 is list2 is", list1 is list2)
print("list1 is not list2 is", list1 is not list2)

# Membership operators
print("\nMembership operators:")
print("1 in list1 is", 1 in list1)
print("4 not in list1 is", 4 not in list1)
