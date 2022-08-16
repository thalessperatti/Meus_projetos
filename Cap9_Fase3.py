'''
arquivo = open("c:\Desenvolvimento\Arquivo_de_texto.txt", encoding="UTF-8")
#print(type(arquivo))

#lendo o arquivo inteiro
#print(arquivo.read())

#lendo por linha
#print(arquivo.readline())
#print(arquivo.readline())

#trazendo todo o conteúdo em uma única linha
#print(arquivo.readlines())

#lendo o arquivo e transformando as linhas em uma só, com o loop for
#for linha in arquivo.readlines():
#    print(linha)

#passando o conteúdo do arquivo para uma lista
#linhas_do_arquivo = arquivo.readlines()

#print("Ei! Eu consegui transformar meu arquivo em uma {}".format(type(linhas_do_arquivo)))

#colocando a lista em ordem alfabética
#linhas_do_arquivo.sort()

#exibindo a lista em ordem alfabética
#print(linhas_do_arquivo)

arquivo.close()
'''
'''
#criando o arquivo
arquivo_2 = open("c:\\Desenvolvimento\\Arquivo_de_texto_2.txt", "w")

#conteúdo que será inserido no arquivo
conteudo = "Estou testando criar um arquivo de texto. Então, estou... textando?"

#incluíndo o conteúdo no arquivo
arquivo_2.write(conteudo)

#fechando o arquivo
arquivo_2.close()
'''
'''
#criando arquivo json
import json

#dicionario
contatos = {
    "Thales Speratti":
        {"Celular":"11982903585",
        "Email":"thales.speratti@gmail.com"},
    "Jessica Speratti":
        {"Celular":"51997386714",
        "Email":"jessica.correia20@hotmail.com"}
}

#print(json.dumps(contatos, indent=4))

#criando o arquivo
arquivo_json = open("C:\\Desenvolvimento\\Arquivo_json.json", "w", encoding="UTF-8")
#informando o conteúdo
conteudo = json.dumps(contatos, indent=4)
#escrevendo o conteúdo no arquivo
arquivo_json.write(conteudo)
#fechando o arquivo
arquivo_json.close()
'''
'''
#transformando um arquivo json em um dicionário
import json

#abrindo o arquivo para leitura
arquivo_json = open("c:\\Desenvolvimento\Arquivo_json.json", "r", encoding="UTF-8")
#lendo o conteúdo e criando uma variável
conteudo = arquivo_json.read()
#fechando o arquivo
arquivo_json.close()
#transformando o json em dicionário
agenda = json.loads(conteudo)
print(agenda)
'''
'''
#função with que não necessita fechar o arquivo ao final da manipulação
with open("c:\\Desenvolvimento\\testando.txt", "w", encoding="UTF-8") as json:
    json.write("Isso é apenas um teste!!!")

print("O arquivo foi salvo")
'''
