from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path('add',views.add),
    path('author',views.author),
    path('authoradd',views.authoradd),
    path('author/<int:author_id>', views.authordata, name='authordata'),
    path('Book/<int:book_id>', views.bookdata, name='bookdata'),
    path('author/addbook',views.addbook ),
    path('Book/addauthor',views.addauthor)    
]
