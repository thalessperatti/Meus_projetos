window.onload = function()
{
    var aLinguagens = ["Javascript",
                       "Java",
                       "PHP",
                       "Python"];
    
    var objDivSaida = document.getElementById("saida");

    for(sLinguagem of aLinguagens) {
        objDivSaida.innerHTML += sLinguagem+"<br>";
    }
}