from django.shortcuts import render,redirect
from .models import user
from django.contrib import messages



def path(request):
    return render(request,'index.html')



def register (request):
    errors = user.objects.register_valid(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect('/')
    else:
        password = request.POST['password']
        new_user = user.objects.create(first_name=request.POST['first_name'],last_name=request.POST['last_name'],
        email=request.POST['email'])
        messages.success(request, "User successfully craeted")
        register=str('registered')
        request.session['name']=str(f'Success! Welcome!, {new_user.first_name}!')
        return render(request,'suc.html')


def login(request):
    user1 = user.objects.filter(email=request.POST['email'])
    return redirect('/')


def success(request):
    return render (request, 'suc.html')


def delete(request):
    del request.session['name']
    return redirect('/')

