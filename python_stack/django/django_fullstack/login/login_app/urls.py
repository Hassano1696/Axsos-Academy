from django.urls import path     
from . import views

urlpatterns = [
    path('', views.path),
    path('register',views.register)
]
