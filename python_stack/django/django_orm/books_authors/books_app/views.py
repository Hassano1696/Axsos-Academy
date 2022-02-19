from django.shortcuts import render,redirect
from .models import Book , Author


def index(request):
    context = {
        "Books": Book.objects.all()
    }
    return render(request,'index.html',context)

def add (request):
    Book.objects.create(title=request.POST['Title'],desc=request.POST['Description'])
    return redirect('/')

def author(request):
    context = {
    "authors": Author.objects.all()
    }
    return render(request,'authors.html',context)

def authoradd(request):
    Author.objects.create(first_name=request.POST['first_name'],last_name=request.POST['last_name'],notes=request.POST['notes'])
    return redirect('/author')

def authordata(request,author_id):
    spec_author=Author.objects.get(id=author_id)
    request.session['authorid']=author_id
    context = {
        "Books": Book.objects.filter(authors=spec_author),
        "Authors":Author.objects.get(id=author_id) ,
        "allBooks": Book.objects.exclude(authors=spec_author)
    }
    return render( request,'authordata.html',context)

def bookdata(request,book_id):
    my_book=Book.objects.get(id=book_id)
    request.session['bookid']=book_id
    context = {
        "Books": Book.objects.get(id=book_id),
        "Authors": Author.objects.filter(books=my_book),
        "allAuthors": Author.objects.exclude(books=my_book)
    }
    return render(request,"books.html", context)

def addbook(request):
    book_id =request.POST['book_name']
    author_id = request.session['authorid']
    new_book=Book.objects.get(id=book_id)
    authorr=Author.objects.get(id=request.session['authorid'])
    authorr.books.add(new_book)
    return redirect("/author/" + str(author_id))

def addauthor(request):
    author_id =request.POST['name_author']
    book_id = request.session['bookid']
    new_author=Author.objects.get(id=author_id)
    my_book=Book.objects.get(id=request.session['bookid'])
    my_book.authors.add(new_author)
    return redirect("/book/" + str(book_id))
