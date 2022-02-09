from django.shortcuts import render, HttpResponse , redirect 


def root(request):
    return redirect("/blogs") 


def index(request):
    return JsonResponse({"response": "placeholder to later display a list of all blogs", "status": True})


def new(request):
    return HttpResponse("placeholder to display a new form to create a new blog")


def create (request):
    return redirect("/")


def show(request,number):
    return HttpResponse(f"placeholder to display blog number: {number}")


def edit(request,number):
    return HttpResponse(f"placeholder to edit blog {number}")


def distroy(request,number):
    return redirect("/blogs") 
