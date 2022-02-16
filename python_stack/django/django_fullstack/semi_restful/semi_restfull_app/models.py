from django.db import models

class Show(models.Model):
    Title = models.CharField(max_length=45)
    Network = models.CharField(max_length=45)
    Release_Date =models.DateTimeField()
    desc = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
