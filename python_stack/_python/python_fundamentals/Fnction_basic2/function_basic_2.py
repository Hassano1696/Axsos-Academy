from ast import For


def countdown(num): #countdown
    list=[]
    for x in range(num,-1,-1):
        list.append(x)
    return list
print(countdown(10))
#####################################

def priturn(list):  # print and return
    print(list[0])
    return list[1]
lis=[5,7]
priturn(lis)
#####################################
def firstplus(list):     #irst plus
    sum=list[0]+len(list)
    return sum
lis=[1,3,5,7,8,9,7]
print(firstplus(lis))
####################################
def greater(list): # greater than seconf
    lis=[]
    count=0
    for x in range(0,len(list),1):
        if list[x]>list[1]:
            count+=1
            lis.append(list[x])
    if count>=2:
        return lis , count
    else:
        return False
        
list= [0,2,0,2,1,4] # it will return false
print(greater(list)) 
###################################
def leng(leng,num):  # this length that value
    list=[]
    for x in range(0,leng,1):
        list.append(num)
    return list
print(leng(4,7))