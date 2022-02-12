

from django.shortcuts import render, redirect
from .models import User
def survey(request):
    context = {
        "users": User.objects.all()
    }
    return render(request, "index.html", context)


def store(request):
    new_user = User(first_name=request.POST['firstname'],last_name=request.POST['lastname'],email=request.POST['email'],age=request.POST['age'])
    new_user.save()
    return redirect("/")
