function soma(num1, num2) //declaração da função soma()
{
    objResultado = document.getElementById("resultado");
    objResultado.innerHTML += (num1+num2) + "<br>";
}

window.onload = function ()
{
    objBotao = document.getElementById("botao");
    objBotao.onclick = function()
    {
        soma(3,5) //chamada da função soma() incluíndo as variáveis
    }
}
