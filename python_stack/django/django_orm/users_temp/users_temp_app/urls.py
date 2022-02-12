from django.urls import path     
from . import views
urlpatterns = [
    path('', views.survey),
    path('store', views.store),	   
]
