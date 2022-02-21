from unittest.util import _MAX_LENGTH
from django.db import models
import re
from datetime import datetime



class UserManager(models.Manager):
    def register_valid(self, postData):
        errors = {}
        if len(postData['first_name']) < 2:
            errors["first_name"] = "First Name should be at least 2 characters"
        name_REGEX = re.compile(r'^[a-zA-Z]+$')
        if not name_REGEX.match(postData['first_name']):               
            errors['first_name'] = "First Name should be letters only"
        if len(postData['last_name']) < 2:
            errors["last_name"] = "Last Name should be at least 2 characters"
        if not name_REGEX.match(postData['last_name']):               
            errors['last_name'] = "Last Name should be letters only"
        EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        if not EMAIL_REGEX.match(postData['email']):              
            errors['email'] = "Invalid email address!"
        if len(postData['password']) < 8 :
            errors["password"] = "password should be at least 8 characters"
        if  postData['password'] != postData['confirm_password']:
            errors["confirm_password"] = "Passwords dose not match "
        return errors

    def login_valid(self, postData):
        errors = {}
        if len(postData['name']) < 5:
            errors["name"] = "Blog name should be at least 5 characters"
        if len(postData['desc']) < 10:
            errors["desc"] = "Blog description should be at least 10 characters"
        return errors


class user(models.Model):
    first_name=models.CharField(max_length=120)
    last_name=models.CharField(max_length=120)
    email=models.CharField(max_length=120)
    password=models.CharField(max_length=120)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects=UserManager()