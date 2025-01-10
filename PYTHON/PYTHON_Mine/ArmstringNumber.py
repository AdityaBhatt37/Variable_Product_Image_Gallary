num = int(input("Enter a number : "))

cnum = num



rev = 0
sum = 0

while(num!=0):

    rem = num%10
    rev = rev*10+rem 
    num = num//10
    
    sum = sum + rem*rem*rem


if(sum == cnum):
    






