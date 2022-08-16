window.onload = function()
{
    objDivSaida = document.getElementById("saida");

    var i=1;
    do
    {
        objDivSaida.innerHTML += i+"<br>";
        i++;
    } while(i > 10);
}