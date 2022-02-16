from django.urls import path     
from . import views
urlpatterns = [
    path('shows', views.shows),
    path('shows/new', views.add),
    path('store',views.store),
    path('shows/back',views.back),
    path('edit',views.edit),
    path('showid',views.showid)
    #path('ading_ninja', views.ninja),
]
