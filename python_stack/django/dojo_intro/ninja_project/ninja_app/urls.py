from django.urls import path     
from . import views
urlpatterns = [
    path('',views.main),
    path('find', views.Find),

]