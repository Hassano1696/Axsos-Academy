from tkinter.ttk import Style
from flask import Flask, render_template
app= Flask(__name__)
@app.route("/")
def hello():
    return "Hello" 
@app.route("/play")
def First_Level():
    return render_template("index.html",number=3 ,color="#9fc5f7")
@app.route("/play/<int:num>")                                                        
def second_sevel(num):
    return render_template("index.html",number=num,color="#9fc5f7")
@app.route("/play/<int:num>/<bg_color>")
def third_level(num,bg_color):
    if bg_color=='white':
        bg_color='blue' #since white won't be visible enough
    return render_template("index.html",number=num, color = bg_color)



if __name__=="__main__":
    app.run(debug=True)
