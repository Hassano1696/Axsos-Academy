from ast import Return
from cgitb import html
from platform import release
from django.shortcuts import render ,redirect
from .models import Show


def shows(request):
    context={
        'shows':Show.objects.all()
    }
    return render ( request,'index.html',context)

def store(request):
    show=Show.objects.create(Title=request.POST['Title'],Network=request.POST['Network'],Release_Date=request.POST['Release_Date'],desc=request.POST['desc'])
    x=show.id
    request.session['showid']=show.id
    return redirect(f'/show/{x}')

def show1(request,show_id):
    context = {
        "show": Show.objects.get(id=show_id)
    }
    return render(request,'html.html',context)

def add(request):
    return render( request,'add.html')

def edit(request,show_id):
    context = {
        "show": Show.objects.get(id=show_id)
    }
    return render(request,"edit.html", context)

def update(request,show_id):
    show=Show.objects.get(id=show_id)
    show.Title=request.POST['Title']
    show.Network=request.POST['Network']
    show.Release_Date=request.POST['Release_Date']
    show.desc=request.POST['desc']
    show.save()
    return redirect(f'/show/{show_id}/edit')



def showid(request):
    return render(request,'html.html')


def back(request):
    return redirect('/shows')

def delete(request,show_id):
    this_show=Show.objects.get(id=show_id)
    this_show.delete()
    return redirect('/shows')



