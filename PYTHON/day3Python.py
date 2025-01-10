# LIST IN PYTHON
# ->List are container which are used to store set of any data type in our python program.
# ->List stores data in orderd manners.

L1 = [1,'Aditya',2,'Priysanhu',3,'Akash','Ayush']
print(L1[0]) #OUTPUT : 1.
print(L1[1]) #OUTPUT : Aditya.

#So, the indexing of List in python starts from 0.

print(L1) #Printing full  list using print() function.

L1[0] = 37 #updating the value of list.

# L1[0] = 01 #Error not take zero in first place.
print(L1)


#LIST SLICING
#List slicing is same as string slicing in python

friends = ["Priyanshu","Ayush","Akash"]

print(friends[1:2]) #OUTPUT : AYUSH

#LIST FUNCTIONS()

lis = [1,9,10,11,2,3,4,7,6,5,8,13,12]

# lis.sort() #sort our list on the orignal memory of List.
# print(lis) 

'''lisSort = lis.sort()
print(lisSort)'''#Rong way OUTPUT : none

lis.reverse()
print(lis)

lis.append(45) #add a value at the end of the list
lis.append(99) #add 99 at the end of list

print(lis)


lis.insert(3,37) #lis.insert(atIndex,value) adding value at the entered index.

print(lis)

lis.pop(2) #lis.pop(atIndex) index 2 value will be removed i.e : 8 after reverse

print(lis)

lis.remove(11) #value 11 will be removed from the list


