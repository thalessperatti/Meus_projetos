window.onload = function()
{
    var oBotao = document.getElementById("botao");
    var oDiv = document.getElementById("cidades");

    oBotao.onclick = function()
    {
        var xhttp = new XMLHttpRequest();
        //disparado quando o servidor da algum sinal de vida
        xhttp.onreadystatechange = function()
        {
            if (xhttp.readyState == 4 && xhttp.status == 200) //readystate em 4 significa que o retorno aconteceu com sucesso. Status 200 significa servidor ok
            {
                document.getElementById("cidades").innerHTML = "<pre>" + xhttp.responseText + "</pre>";
            }
        };
        xhttp.open("GET", "ajax1_cidades.txt",true);
        xhttp.send();
    }
}