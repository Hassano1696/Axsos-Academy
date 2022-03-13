from multiprocessing import context
from django.shortcuts import render,redirect
from .models import User,Wish
from django.contrib import messages



def path(request):
    return render(request,'index.html')


def register (request):
    errors=User.objects.register_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect('/')
    else:
        new_user=User.objects.create(first_name=request.POST['first_name'],last_name=request.POST['last_name'],
        email=request.POST['email'],password = request.POST['password'])
    return redirect('/success')

def login(request):
    errors = User.objects.login_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        if( len(User.objects.filter(email=request.POST['email']))>0):
            messages.error(request,"the password isn't correct")
            if (request.POST['password']!= User.objects.get(email=request.POST['email']).password):
                messages.error(request, "the password isn't correct")
                return redirect('/')
            messages.error(request, " this user isn't registered yet")
            return redirect('/')
    else:
        request.session['first_name']=User.objects.get(email=request.POST['email']).first_name
        return redirect('/success')


def success(request):
    context={
        'user': User.objects.get(id=request.session['first_name'].id),
        'wishes': Wish.objects.get(all),
        'user_with_wish': User.objects.wishes.all
        }
    return render (request,'suc.html',context)


def addwish(request):
    return render(request,'addwish.html')

def store(request):
    Wish.objects.create(name=request.POST['name'],description=request.POST['description'] )
    return redirect('/success')

def delete(request):
    del request.session['name']
    return redirect('/')