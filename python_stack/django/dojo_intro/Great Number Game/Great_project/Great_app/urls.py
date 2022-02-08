from django.urls import path     
from . import views
urlpatterns = [
    path('', views.Main),	  
    path('lets_guess',views.Lets_guess) 
]
