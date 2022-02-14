import re
from django.shortcuts import render,redirect
from .models import Dojos, Ninjas

def index(request):
    context = {
        "dojos": Dojos.objects.all(),
        "ninjas": Ninjas.objects.all()
    }
    return render(request, "index.html", context)

def dojo(request):
    
    Dojos.objects.create(
        name=request.POST['name'],
        city=request.POST['city'],
        state=request.POST['state'])
    return redirect("/")

def ninja(request):
    Ninjas.objects.create(
        first_name=request.POST['first_name'],
        last_name=request.POST['last_name'],
        dojo=Dojos.objects.get(name=request.POST['dojo_name']))
    return redirect("/")
