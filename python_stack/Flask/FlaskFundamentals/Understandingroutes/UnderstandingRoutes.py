from distutils.log import debug
from flask import Flask
app= Flask(__name__)
@app.route("/")
def hello():
    return "Hello World!!"

@app.route("/dojo")
def dojo():
    return "Dojo" 
@app.route('/say/<name>')
def say(name):
    return "Hi "+ name
@app.route("/repeat/<int:num>/<name>")
def repeat(num,name):
    return  name  * num
@app.errorhandler(404)
def not_found(e):
    return  'Sorry! No response. Try again.'

if __name__=="__main__":
    app.run(debug=True)

