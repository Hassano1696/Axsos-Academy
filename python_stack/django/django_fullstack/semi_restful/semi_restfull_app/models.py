from django.db import models
from datetime import datetime


class ShowManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['Title']) < 2:
            errors["Title"] = "Show title should be at least 2 characters"
        if len(postData['Network']) < 3:
            errors["Network"] = "Show network should be at least 3 characters"
        if 0 < len(postData['desc']) < 10:
            errors["desc"] = "Show description should be at least 10 characters"
        if postData['Release_Date'] > str(datetime.now()):
            errors["Release_Date"] = "Show release_date should be in the past"
        
        return errors


class Show(models.Model):
    Title = models.CharField(max_length=45)
    Network = models.CharField(max_length=45)
    Release_Date =models.DateTimeField()
    desc = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()



