from ast import Return
from cgitb import html
from platform import release
from django.shortcuts import render ,redirect
from .models import Show
from django.contrib import messages



def shows(request):
    context={
        'shows':Show.objects.all()
    }
    return render ( request,'index.html',context)

def store(request):
    errors = Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect('/shows/new')
    else:

        show=Show.objects.create(Title=request.POST['Title'],Network=request.POST['Network'],Release_Date=request.POST['Release_Date'],desc=request.POST['desc'])
        C=show.id
        request.session['showid']=show.id
        return redirect(f'/show/{C}')

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
    errors = Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect(f'/show/{show_id}/edit')
    else:
        show=Show.objects.get(id=show_id)
        show.Title=request.POST['Title']
        show.Network=request.POST['Network']
        show.Release_Date=request.POST['Release_Date']
        show.desc=request.POST['desc']
        show.save()
        return redirect(f'/show/{show_id}/edit')


def delete(request,show_id):
    this_show=Show.objects.get(id=show_id)
    this_show.delete()
    return redirect('/shows')



