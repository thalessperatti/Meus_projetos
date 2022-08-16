window.onload = function() 
{
    var objTxtNota = document.getElementById("nota");
    var objDivResultado = document.getElementById("resultado");
    var objBotao = document.getElementById("botao");

    objBotao.onclick = function ()
    {
        var objFloNota = parseFloat(objTxtNota.value);
        if (objFloNota >= 6.0)
        {
            objDivResultado.innerHTML = "Aluno Aprovado.";
            console.log("Aluno aprovado com nota "+objFloNota);
        }
        else
        {
            objDivResultado.innerHTML = "Aluno Reprovado.";
            console.log("Aluno reprovado com nota "+objFloNota);
        }
    }
}