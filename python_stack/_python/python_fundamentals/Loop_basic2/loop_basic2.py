def biggie_size(list): #biggie size
    for x in range (0, len(list)):
        if list[x] > 0 :
            list[x] = "big"
    return list

l=[1,-9,5,-8,7,-2]
print(biggie_size(l))
##################################  
def count_positives(list): # count positive
    count = 0
    for x in range (0, len(list)):
        if list[x] > 0 :
            count +=1
    list[len(list)-1]= count
    return list
l=[1,6,-4,-2,-7,-2]
print(count_positives(l))
###################################
def sum_total(list): #sum total
    sum = 0
    for x in range (0, len(list)):
        sum = sum +list[x]
    return sum
l=[1,2,3,4]
print(sum_total(l))
##########################
def average(list): #Average
    sum = 0
    for x in range (0, len(list)):
        sum = sum +list[x]
    avg = sum / len(list)
    return avg
l=[1,2,3,4]
print(average(l))
########################
def length(list): #length
    x=len(list)
    return x
l=[37,2,1,-9]
print(length(l))
######################
def Min(list): #minimum
        if len(list) == 0:
            return False
        else:
            min = list[0]
            for x in range (1, len(list)):
                if list[x] < min:
                    min = list[x]
        return min
l=[37,2,1,-9]
print(Min(l))
########################
def Max(list): #MAximum
        if len(list) == 0:
            return False
        else:
            max = list[0]
            for x in range (1, len(list)):
                if list[x] > max:
                    max = list[x]
        return max
l=[37,2,1,-9]
print(Max(l))
############################
def ultimate_analysis(list): # ultimate analysis (dictionary)
    analysis = {}
    analysis["sumTotal"]=sum_total(list)
    analysis["average"]=average(list)
    analysis["minimum"]=Min(list)
    analysis["maximum"]=Max(list)
    analysis["length"]=len(list)
    return analysis
l=[37,2,1,-9]
print(ultimate_analysis(l))
####################################
def list_reverse(list):  #List Reverse
    for x in range(0, int(len(list)/2),1):
        temp = list[x]
        list[x]= list[len(list)-1-x]
        list[len(list)-1-x] =temp
    return list
l=[37,2,1,-9]
print(list_reverse(l))
