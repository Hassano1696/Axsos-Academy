from django.shortcuts import render,redirect
from .models import user

def path(request):
    return render(request,'index.html')

def register(request):
    user.objects.create(
        first_name=request.POST['first_name'],
        last_name=request.POST['last_name'],
        email=request.POST['email'],
        password=request.POST['password']
    )
    return redirect('/')