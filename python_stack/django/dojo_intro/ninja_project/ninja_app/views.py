import re
from django.shortcuts import render,redirect
import random

def main(request):
    if not 'gold' in request.session:
        request.session['gold']=0
    if not 'result' in request.session:
        request.session['result']=''
    return render(request,'ninja.html')

def Find(request):

    if request.POST['which_form'] == 'Farm':
        request.session['num']=random.randint(10,20)
        request.session['gold']+=request.session['num']
        request.session['result']+=f"Earned {request.session['num']} golds from the farm! "
    elif request.POST['which_form'] == 'Cave':
        request.session['num']=random.randint(5,10)
        request.session['gold']+=request.session['num']
        request.session['result']+=f"Earned {request.session['num']} golds from the Cave! "
    elif request.POST['which_form'] == 'House':
        request.session['num']=random.randint(2,5)
        request.session['gold']+=request.session['num']
        request.session['result']+=f"Earned {request.session['num']} golds from the House! "
    else:
        request.session['num']=random.randint(-50,50)
        request.session['gold']+=request.session['num']
        if request.session['num']>0:
            request.session['result']+=f"Earned {request.session['num']} golds from the Casino! "
        else:
            request.session['result']+=f"Lost {request.session['num']} golds from the House! "
    return redirect('/')
