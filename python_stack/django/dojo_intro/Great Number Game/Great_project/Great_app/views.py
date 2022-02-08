from django.shortcuts import render,redirect
import random  

def Main(request):
    request.session['random']=random.randint(1, 100)
    return render(request,'great.html')

def Lets_guess(request):
    request.session['num']=request.POST['number']
    if request.session['random']==int(request.POST['number']):
        request.session['result'] = str('Is The Correct Guess!')
    elif request.session['random']>int(request.POST['number']):
        request.session['result'] =str('Is Too Low!')
    else:
        request.session['result'] =str(' Is Too High!')
    return redirect('/')