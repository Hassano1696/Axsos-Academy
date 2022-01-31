x = [ [5,2,3], [10,8,9] ]  #Update Values
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
{'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
x[1][0]=15
students[0]['last_name']='Bryant'
z = [ {'x': 10, 'y': 20} ]
sports_directory['soccer'][0]= 'Andres'
z[0]['y']=30
print(x)
print(students)
print(z)
print(sports_directory)
##############################################
students = [             # Iterate Through a List of Dictionaries
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
def iterateDictionary(students) :
    for i in range (0,len(students)):
        print('first_name - '+ students[i]['first_name']+', '+'last_name - '+  students[i]['last_name'])
iterateDictionary(students)
#############################################
def iterateDictionary2(key_name="", some_list=[]):   #Get Values From a List of Dictionaries
    for i in range (0,len(some_list)):
        print(some_list[i][key_name])
students = [            
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
iterateDictionary2('last_name',students)
###############################################
dojo = {             #dictionary iteration
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
def PrintInfo(some_dict):
    for x in some_dict:   
        print(len(some_dict[x]), x.upper())
        for i in some_dict[x]:
            print (i)
PrintInfo(dojo)
