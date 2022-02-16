from ast import Return
from cgitb import html
from platform import release
import re
from django.shortcuts import render ,redirect
from .models import Show


def shows(request):
    context={
        'shows':Show.objects.all()
    }
    return render ( request,'index.html',context)

def add(request):
    return render( request,'add.html')

def store(request):
    Show.objects.create(
        Title=request.GET['Title'],
        Network=request.GET['Network'],
        Release_Date=request.GET['Release_Date'],
        desc=request.GET['desc']
    )
    return redirect('/shows/{{show.id}}')

def showid(request):
    return render(request,'html.html')


def back(request):
    return redirect('/shows')

def edit(request):
    return render(request,'edit.html')