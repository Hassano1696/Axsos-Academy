
from django.shortcuts import render
    
def survey(request):
    return render(request,'Survey.html')


def result(request):
    context = {
        "name" : request.POST['Name'],
        "Location" : request.POST['Location'],
        "Language" : request.POST['Language'],
        "comment" : request.POST['comment']
    }
    return render(request,'result.html',context)
