from django.shortcuts import render
from time import localtime, strftime
    
def dtime(request):
    context = {
        "time": strftime("%b %d, %Y %H:%M:%S %p", localtime())
    }
    print("time")
    return render(request,'dtime.html', context)
