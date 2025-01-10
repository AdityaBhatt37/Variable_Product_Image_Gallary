'''
Slicing concept of String -:
->Selcting a sub-part of a string.

Syntax is : 

StringVariableName[StartIndex: StopIndex: IndexToSkip]
NOTE1: Default value of IndexToSkip is +1
NOTE2: Default value of StartIndex is 0(Zero).

'''
str1 = "Dehradun"
str2 = str1[:5:]
str1 = str1[2::]
print("sub-string is: ",str2)
