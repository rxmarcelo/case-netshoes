function mascaraDeTelefone(telefone) {

    var textoAtual = telefone.toString();
    var tipoTel = textoAtual.length
    console.log (tipoTel.length);
    var textoAjustado = ''

    if (tipoTel === 11) {
        const parte1 = textoAtual.slice(0, 2);
        const parte2 = textoAtual.slice(2, 7);
        const parte3 = textoAtual.slice(7, 11);
        textoAjustado = `(${parte1}) ${parte2}-${parte3}`
    } else if (tipoTel === 10) {
        const parte1 = textoAtual.slice(0, 2);
        const parte2 = textoAtual.slice(2, 6);
        const parte3 = textoAtual.slice(6, 10);
        textoAjustado = `(${parte1}) ${parte2}-${parte3}`
    } else {
        textoAjustado = null
    }
    
    return textoAjustado
}