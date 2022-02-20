from django.urls import path     
from . import views
urlpatterns = [
    path('shows', views.shows),
    path('shows/new', views.add),
    path('store',views.store),
    path('show/<int:show_id>',views.show1,name='show'),
    path('show/<int:show_id>/edit', views.edit, name='edit'),
    path('update/<int:show_id>', views.update),
    path('show/<int:show_id>/delete', views.delete),

]
