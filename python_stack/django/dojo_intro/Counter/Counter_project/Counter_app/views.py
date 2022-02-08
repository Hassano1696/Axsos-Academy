from django.shortcuts import render ,redirect

def REG(request):
    if 'count' not in request.session:
        request.session['count']=0
    else:
        request.session['count']+=1


    return render(request,'counter.html')

def destroy_session(request):
    request.session['count']=0
    return redirect ('/')