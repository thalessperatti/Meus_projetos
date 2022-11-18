import pandas as pd

from flask import Flask, jsonify

#construir as funcionalidades
app = Flask(__name__)

@app.route('/pegarvendas', methods=['GET'])
def pegarvendas():
    tabela = pd.read_csv('API_Python\MinhaAPI\Advertising.csv')
    total_vendas = tabela['Vendas'].sum()
    resposta = {'total_vendas': total_vendas}
    return jsonify(resposta)


#rodar a api
app.run(port=5100, host='localhost', debug=True)




