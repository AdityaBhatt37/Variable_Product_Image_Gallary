# percentage = float(input("Enter your percentage : "))

# if(percentage<35):
#     print("Fail")

# elif(percentage>=35):

#     if(w r percentage>=35 and percentage<=50):

#         print("3rd")

#     elif(percentage>50 and percentage<=70):

#         print("Second")
    
#     elif(percentage>70 and percentage<=100):

#         print("1st")




#Q2
# sum = 0
# for i in range(1,11):

#     n = int(input("Enter a number : "))

#     sum = sum + n


# print("The sum is : ",sum," and average is : ", sum/10)



#Q3:sum of the digits

# n = int(input("Enter a number : "))

# rem = 0
# sum = 0

# while(n!=0):

#     rem = n%10

#     sum = sum+rem

#     n = n//10

# print("The sum of the digit is : ",sum)



#Q4: prime number between one to hundred


# for n in range(2,101):

#     q = n//2
#     flag = 0

#     for i in range(2,q+1):

#         if(n%i==0):
            
#             flag = 1
   
#     if(flag == 1):

#         print(n," is not a prime number")

#     else:
#         print(n," is a prime number")



#Q5: Strong

# n = int(input("Enter a number : "))

# rem = 0
# fact = 1
# summ = 0
# dupn = n

# while(n!=0):

#     rem = n%10
#     fact = 1

#     for i in range(1,rem+1):

#         fact = fact*i

#     summ = summ+fact

#     n = n//10


# if(summ == dupn):

#     print("number is strong number")

# else:
#    print("number is not a strong number")





#Q6:Palindrome

# rem = 0
# rev = 0


# n = int(input("Enter a number : "))
# dupn = n

# while(n!=0):

#     rem = n%10

#     rev = rev*10+rem

#     n = n//10


# if(rev == dupn):

#     print("number is palindrome")

# else:

#     print("number is not a palindrome")



  
#7: Armstrong number

# n = int(input("Enter a number : "))

# dupn = n
# sum = 0
# q = 0

# while(n!=0):

#     rem = n%10

#     q = rem*rem*rem

#     sum = sum+q

#     n = n//10

# if(sum==dupn):
    
#     print("armstrong")

# else:
#     print("Not armstrong")






#8: perfact

# n = int(input("Enter a number : "))

# summ = 0

# for i in range(1,n):

#     if(n%i==0):

#         summ = summ+i
    

# if(n==summ):

#     print("perfact")

# else:

#     print("not perfact")
    



#Q10: fibonacci
    
# n = int(input("Enter a number : "))

# a = 0 
# b = 1
# c = 0

# print(a,", ",end=" ")
# for i in range(2,n+1):

#     c = a+b
#     print(c,", ",end=" ")
#     a = b
#     b = c