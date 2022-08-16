function soma(num1,num2) //declaração da função soma()
{
    return num1+num2;
}

window.onload = function()
{
    objBotao = document.getElementById("botao");
    objBotao.onclick = function()
    {
        objResultado = document.getElementById("resultado"); //chamadas da função soma()
        objResultado.innerHTML += soma(soma(3,5), 8) + "<br>"; //primeiro ele irá somar 3 e 5 e do resultado, somar 8
    }
}