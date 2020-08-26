function formatarTelefone(telefone) {
    let telAtual = telefone.toString();
    let tipoTel = telAtual.length
    let telFormatado = ''

    const tomaSlice = (n1, n2) => {
        return telAtual.slice(n1, n2)
    }

    if (tipoTel === 11) {
        telFormatado = `(${tomaSlice(0, 2)}) ${tomaSlice(2, 7)}-${tomaSlice(7, 11)}`
    } else if (tipoTel === 10) {
        telFormatado = `(${tomaSlice(0, 2)}) ${tomaSlice(2, 6)}-${tomaSlice(6, 10)}`
    } else {
        telFormatado = null
    }

    return telFormatado
}