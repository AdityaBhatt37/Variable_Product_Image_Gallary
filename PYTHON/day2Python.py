#STRING SLICING IN PYTHON
# ->What is string slicing in python 
#   ->String slicing mean to get the slice of the string in our python program.
''' So the length of a string in python start form the  0 index'''

str1 = "Aditya"

print(str1[0:3]) #getting the string slice in python
                #[0:3]-> 3 will be exclude so the output will be :Adi

print(str1[0:5]) #getting character from 0 to 5 where 5 is exclude OUTPUT: Adity

print(str1[0:]) #to purri string print ho jaygi because agar last waala blank hai to
                # to usko wo end tak leke jaata hai jitni bhi hamari string ki length hoggi.

print(str1[:3]) #it is same as (str[0:3])

print(str1[3:]) #same as (str1[3:end])



#NEGATIVE INDEX OF STRIN IN PYTHON

#So, the negative indexes in python is start from "-1" for last character and minus(-n) upto (n)length of string +1.
#We, use negative index in python because if we want to access the end character of a string and we dont know the 
#length of a string so we can use negative indexing in python for string.

print(str1[-1]) #OUTPUT will be : a


print(str1[0:-3]) #it si same as str1[0:3]

# A  d  i  t  y  a
# 0  1  2  3  4  5 ->normal indexing
#-6 -5 -4 -3 -2 -1 ->Negative indexing

print(str1[-6:-3])
# print(str1[-1:-6])


#SKIP VALUE STRING SLICING IN PYTHON
name = "AdityaPrasadBhatt"

print(name[0::2]) #name[startingIndex : endIndex : numberOfcharacerSkip] 
                  #if 2 then 1 character value will skip .

str = "aditya Prasad Bhatt"
#STRING FUNCTIONS IN PYTHON

print(len(str)) #it will give the length of string with spaces
                #means number of character along with number of spaces.

print(str.endswith("bhatt")) #endswith() function return true and false 
                             #if the string is ends with the same word
                             #here output is : false because my string is ending with "Bhatt"

print(str.count('a')) #count() function count the number of charcters,words indermediate 
                      #combination of words.
print(str.count('ad'))
print(str.count("lkafsafda"))#if not found then output is : 0
print(str.count("aditya"))


print(str.capitalize()) #it will capitalize our first charater of a string if it is not.


print(str.find("aditya"))#OUTPUT is : 0 means "string aditya" is present from 0th index


str2 = "bhatt Ayush Ayush"

print(str2.find("Ayush"))#find function only tell the indexing of first occuring string not all the repeat string.
                         #OUTPUT : 6

print(str2.find("y")) #OUTPUT : 7
print(str2.find('at')) #OUTPUT : 2  this function also used to find char,word,intermediate combination of char index.


print(str2.replace("bhatt", "Ayush Bhatt")) #replace() function replace old word with new word,string in entire string.




#ESCAPE SEQUENCE CHARACTER IN PYTHON
#/n ->backSlach n used to get new line
#/t ->tab
#// -> to write '/' backslash in our string.
#/' ->to write backslash along with single quote

story = "this is /' quote of the heaven and Hell"
print(story)
