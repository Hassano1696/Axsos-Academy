from flask import Flask, render_template, session,redirect
app = Flask(__name__)
app.secret_key = 'keep it secret, keep it safe'

@app.route('/')
def counter():
    
    if  'count' in session:
        session['count']+=1
    else:
        session['count']=0
    if 'real' in session:
        session['real']+=1
    else:
        session['real']=0
    if 'imagin' not in session:
        session['imagin']=0
    return render_template("counter.html",count1=session['count'])

@app.route('/bytwo')
def two():
    session['count']+=1
    session['imagin']+=2
    session['real']-=1

    return redirect ("/")

@app.route('/<int:num>')
def user(num):
    session['count']+=(num-1)
    session['imagin']+=num
    session['real']-=1
    return redirect ("/")


@app.route('/destroy_session')
def destroy():
    session.pop('count')
    session.pop('imagin')
    session.pop('real')
    session.clear()	
    return redirect ("/")

@app.route('/log')
def log():
    return render_template("log.html",imagin=session['imagin'],real=session['real'])



if __name__ == "__main__":
    app.run(debug=True)