from turtle import color
from flask import Flask, render_template
app= Flask(__name__)

@app.route("/") # first route will have an 8*8 cells with red and black colors
def Checkerboard():
    return render_template("Checkerboard.html",num1=8,num2=8,color1='red',color2='black') 
@app.route("/<int:numb2>") # second route will have an 8 rows but a variable columns and with a red and black colors
def Checkerboardhalf(numb2):
    return render_template("Checkerboard.html",num1=8,num2=numb2,color1='red',color2='black')
@app.route("/<int:numb1>/<int:numb2>") #third route will have variable rows and columns with a red and black colors
def Checkerboardxy(numb1,numb2):
    return render_template("Checkerboard.html",num1=numb1, num2=numb2,color1='red',color2='black')
@app.route("/<int:numb1>/<int:numb2>/<bg1>/<bg2>") # bonus route will have a variable rows and columns in addition to a variable colors
def Checkerboardxybg(numb1,numb2,bg1,bg2):
    return render_template("Checkerboard.html",num1=numb1, num2=numb2,color1=bg1,color2=bg2)



if __name__=="__main__":
    app.run(debug=True )
