window.onload = function()
{
    objDivSaida = document.getElementById("saida");

    for(i=1;i<=10;i++)
    {
        objDivSaida.innerHTML += i+"<br>";
    }
}