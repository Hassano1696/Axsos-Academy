for x in range(0, 150, 1): #basic
    print(x)

for x in range(5,1001,5): #multiples of 5
    print(x)


for x in range(0, 101, 1): #counting
    if x % 10 == 0:
        print("Coding Dojo")
    elif x % 5 == 0:
        print("Coding")
    else:
        print(x)

    sum=0   #Whoa
for x in range (0,500001,1):
    if x%2!=0:
        sum=sum+x
print(sum)
for x in range(2018,0,-4):  # count down by 4
    print (x)
LowNum=2
HighNum=9
Mult=3
for x in range( LowNum,HighNum+1,1): # Flexible Counter
    if x%Mult==0:
        print(x)