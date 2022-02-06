from flask import Flask, render_template, request
app = Flask(__name__)
# our index route will handle rendering our form
@app.route('/')
def index():
    return render_template("Survey.html")


@app.route('/result', methods=['POST'])
def results():
    print(request.form)
    name_from_form = request.form['Name']
    location_from_form = request.form['Location']
    language_from_form = request.form['Language']
    comment_from_form=request.form['Comment']
    return render_template("result.html", name=name_from_form, Language=language_from_form , Location=location_from_form , comment=comment_from_form)


if __name__ == "__main__":
    app.run(debug=True)