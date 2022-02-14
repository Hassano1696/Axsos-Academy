from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path('adding_dojo', views.dojo),
    path('ading_ninja', views.ninja),
]
