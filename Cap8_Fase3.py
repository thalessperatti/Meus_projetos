'''
import sys

#ESPAÇO EM MEMÓRIA
#calculando o espaço utilizado pelas variáveis
nome = "Bruce Wayne"
idade = 30
peso = 92.3


print("A variável nome tem {} e tem {} bytes".format(type(nome),sys.getsizeof(nome)))
print("A variável idade tem {} e tem {} bytes".format(type(idade), sys.getsizeof(idade)))
print("A variável peso tem {} e tem {} bytes".format(type(peso),sys.getsizeof(peso)))


#calculando o espaço utilizado pelas listas e pelas tuplas
lista = []
tupla = ()

print("O Objeto lista é do tipo {} e tem {} bytes".format(type(lista),sys.getsizeof(lista))) #56 bytes
print("O Objeto lista é do tipo {} e tem {} bytes".format(type(tupla),sys.getsizeof(tupla))) #40 bytes


#TUPLAS
#possibilidades das tuplas
tupla = (1,7,7,19,3,2,11,15,6,1,5)

#exibição da tupla
print(f"A tupla foi criada assim: {tupla}")

#contagem de elementos
contagem = tupla.count(7)
print(f"Nessa tupla o número {7} se repete {contagem} vezes")

#índice em que encontrou o valor
índice = tupla.index(11)
print(f"O número {11} foi encontrado no índice: {índice}")

#utilizando enumerate para mostrar uma sequência
for numero, valor in enumerate(tupla):
    print(f"No índice {numero} temos: {valor}")

#mostrando a quantidade de itens da tupla
print(f"Quantidade: {len(tupla)}")

#mostrando o valor mínimo da tupla
print(f"Mínimo: {min(tupla)}")

#mostrando o valor máximo da tupla
print(f"Máximo: {max(tupla)}")

#mostrando a soma de todos os valores da tupla
print(f"A soma é: {sum(tupla)}")

#utilizando tuple() para a conversão de uma lista para uma tupla
lista = [True, False]
print(f"Lista: {lista}")
tupla2 = tuple(lista)
print(f"Tupla: {tupla2}")

#criando a tupla3 com valores 1(True) e 0(False)
tupla3 = (1,0)

#função all
print(f"Testando a tupla2 com all: {all(tupla2)}")
print(f"Testando a tupla3 com all: {all(tupla3)}")

#função any
print(f"Testando a tupla2 com any: {any(tupla2)}")
print(f"Testando a tupla3 com any: {any(tupla3)}")
'''

'''
#DICIONÁRIO
#criando duas listas
personagens = []
categorias = []
#executando um loop 10x
for x in range(10):
    #pedindo que o usuário informe um nome e coloque na lista de personagens
    personagens.append(input("Informe o nome do personagem: "))
    #pedindo que o usuário informe a categoria e incluíndo na lista de categorias
    categorias.append(input("Informe a categoria do personagem: "))

#executando um loop 10x
for índice in range(10):
    #exibindo a cada volta o que está contido em um índice de personagens e categorias
    print("O personagem {} é um(a) {}".format(personagens[índice],categorias[índice]))

dicionário = {}
print("O objeto dicionário é do tpo {}".format(type(dicionário)))


dicionário = {"Pernalonga":"coelho","Patolino":"pato","Lola Bunny":"coelho","Frajola":"gato","Frangolino":"frango"}
print(dicionário["Pernalonga"])

dicionário = {"Pernalonga":"coelho","Patolino":"pato","Lola Bunny":"coelho","Frajola":"gato","Frangolino":"frango"}
for valor in dicionário.values():
    print(valor)

dicionário = {"Pernalonga":"coelho","Patolino":"pato","Lola Bunny":"coelho","Frajola":"gato","Frangolino":"frango"}
for item in dicionário.keys():
    print(item)

dicionário = {"Pernalonga":"coelho","Patolino":"pato","Lola Bunny":"coelho","Frajola":"gato","Frangolino":"frango"}
for item,valor in dicionário.items():
    print("O personagem {} é da categoria {}".format(item,valor))


#incluindo uma nova chave e novo valor no dicionário
dicionário = {"Pernalonga":"coelho","Patolino":"pato","Lola Bunny":"coelho","Frajola":"gato","Frangolino":"frango"}
nova_chave = input("Informe o nome do personagem: ")
novo_valor = input("Informe a categoria do personagem: ")
dicionário[nova_chave]=novo_valor

for chave,valor in dicionário.items():
    print("O personagem {} é da categoria {}".format(chave,valor))


#alterando um valor de um dicionário
dicionário = {"Pernalonga":"coelho","Patolino":"pato","Lola Bunny":"coelho","Frajola":"gato","Frangolino":"frango"}
dicionário["Frangolino"]="frangão"

for chave,valor in dicionário.items():
    print("O personagem {} é da categoria {}".format(chave,valor))


#excluíndo itens do dicinário
#1ª possibilidade - excluir um item através de sua chave (frajola)
dicionário = {"Pernalonga":"coelho","Patolino":"pato","Lola Bunny":"coelho","Frajola":"gato","Frangolino":"frango"}
dicionário.pop("Frajola")

for chave,valor in dicionário.items():
    print("O personagem {} é da categoria {}".format(chave,valor))


#2ª possibilidade - excluir o último item inserido (frangolino)
dicionário = {"Pernalonga":"coelho","Patolino":"pato","Lola Bunny":"coelho","Frajola":"gato","Frangolino":"frango"}
dicionário.popitem()

for chave,valor in dicionário.items():
    print("O personagem {} é da categoria {}".format(chave,valor))


#3ª possibilidade - excluir o dicionário inteiro
dicionário = {"Pernalonga":"coelho","Patolino":"pato","Lola Bunny":"coelho","Frajola":"gato","Frangolino":"frango"}
dicionário.clear()

for chave,valor in dicionário.items():
    print("O personagem {} é da categoria {}".format(chave,valor))
'''

#DICIONÁRIO DENTRO DE DICIONÁRIO
contatos = {
    "Thales Speratti":
        {"Celular":"11982903585",
        "Email":"thales.speratti@gmail.com"},
    "Jessica Speratti":
        {"Celular":"51997386714",
        "Email":"jessica.correia20@hotmail.com"}
}

for contato, formas in contatos.items():
    for celular, email in formas.items():
        print(f"O contato {contato} pode ser encontrado no celular {celular} e no email {email}")