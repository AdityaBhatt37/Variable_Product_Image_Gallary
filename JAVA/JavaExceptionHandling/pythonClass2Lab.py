#IDENTITY OPERATOR
v1 = "GEHU"
v2 = "gehu"

print(v1 is v2)#Check weather the variables are same or not.
#OUTPUT : false


print(v1 is not v2)#check weather the variable should not equal to the other variable value.
#OUTPUT : true

#MEMBERSHIP OPERATOR
'''
i) in
   Syntax is :

   it will give output in the form True and False.
   When the 'Value' is present in 'SequenceOfValues' then it will
   return True otherwise it will return False.

ii) not in 
    Syntax is :
    Value not in SequenceOfValues

    It will give output in the form True and False.
    when the 'Value' is not present in 'SequenceOfValues' then it
    will return True otherwise it will return False.

'''


fn = input("Enter value of find : ")
str1 = "graphic era hill to be university"
str2 = "graphic era deemed to be university"

print("The value of (str1 in str2) is : ",str1 in str2)
print("The value of (fn in str1) is : ", fn in str1)