from django.urls import path     
from . import views
urlpatterns = [
    path('', views.REG),	  
    path('destroy_session',views.destroy_session) 
]

