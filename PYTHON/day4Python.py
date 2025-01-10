#TOUPLES IN PYTHON
#->Touples are immutable data types in python.(can not change).

a = (1,3,4,'aditya') #CREATION OF TOUPLE WITH () parenthesis.
print(a)

Emptoup = () #CREATION OF EMPTY TOUPLE.
print(Emptoup)


#SingleValueToup = (1) #WRONG WAY TO CREATE A SINGLE VALUE TOUPLE.

SingleValeToup = (1,) #CORRECT WAY TO CREATE A SINGLE VALUE TOUPLE.
print(SingleValeToup)


#METHODS OF TOUPLE

toup = (1,2,3,4,5,5,1,2,3,4,5)

print(toup.count(5)) #Return the number of occorence of the value in a touple.

print(toup.index(5)) #Return the first index occorence value.

#WHAT MAKES TOUPLE DIFFERENT FROM THE LIST
#That in python Touple are immutable means we cannot change their values.
#or we can say that reassignmet of values are not allowed in touple.

print(toup[0])
#toup[0] = 33 #This will throw an error.




#DICTIONARY IN PYTHON
#->Dictionary in python is a collection of key value pair.
#->Means collection of a key and value stored corresponding to it.

#Syntax
'''
Name_Of_Dictionary = {

      "key" : "value",
      
      "key2" : "values"
}
'''


Dic = {

    "My Dic" : "So fast",
    "fast" : "Quick way to do something",
    "positive numbers " : [1,2,3,4,5,'...']
}

print(Dic) #Accesing full dictionary

print(Dic["My Dic"]) #Accessing the single value of a dictionary


Dic2 = {

    "my" : "mine",
    "Hello" : "World",

    "Dic2Child " :  {

        "CPU" : "Centeral Processing Unit",
        'PC' : "A Register inside CPU(Program Counter)"

    }

}


