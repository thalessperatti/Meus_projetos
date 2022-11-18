from flask import Flask,render_template, jsonify, request, redirect, session, flash, url_for

import requests
import json

app = Flask(__name__)

api = 'https://api.chucknorris.io/jokes/'


class category:
    def __init__(self,categoria):
          self.categoria=categoria

categorias = []

#consulta piada random
@app.route('/random', methods=['GET'])
def random_joke():
    request = requests.get(api + 'random')
    piada = json.loads(request.content)
    status = request.status_code
    return render_template('random.html', titulo='Random Joke', status_code=status, response=piada['value'])


#consulta por categoria
@app.route('/categories_post', methods=['POST'])
def post_category():
    if request.method == 'POST':
        categoria = request.form['categoria']
        requisicao = requests.get(api + 'random?category=' + categoria)
        piada = json.loads(requisicao.content)
        status=requisicao.status_code
        return render_template('joke_by_category.html', titulo='Joke By Category',status_code=status, response=piada['value'])
        

@app.route('/categories', methods=['GET','POST'])
def get_category():
    print(request.method)
    if request.method == 'POST':
        categoria = request.form['categoria']
        requisicao = requests.get(api + 'random?category=' + categoria)
        print(requisicao)
        piada = json.loads(requisicao.content)
        status=requisicao.status_code
        print(piada)
        return render_template('joke_by_category.html', titulo='Joke By Category',status_code=status, response=piada['value'])
    else:
        return render_template('categories.html', titulo='Joke By Category')


app.run(host='localhost', port=5500 ,debug=True)