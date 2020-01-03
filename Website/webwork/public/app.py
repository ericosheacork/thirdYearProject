from flask import Flask
import pandas as pd
app = Flask(__name__)
dataset = pd.read_cvs('cardio_train.cvs')

@app.route("/",methods=['POST'])
def predictRisks():
    return render_template('insurer_profile.html',predictiontext = "hello{}")
if __name__ == "__main__":
    app.run()
