import random
def randInt(min=  0 , max=  100 ):
    if min >= max or max<=0:
        return False
    else:
        num = round((random.random()*(max-min))+min)
        return num
print(randInt()) 
print(randInt(max=50)) 
print(randInt(min=50)) 	
print(randInt(min=50, max=500))   
print(randInt(min=20, max=2))  #it will return false immediately 
