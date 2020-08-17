# Case Netshoes - Clientes

## Testando o projeto

  - Abrir código fonte
  - Subir o Java 
  - Abrir o Postman

obs.: É necessário ter o Maven e Java 8 configurados.

### Incluir Cliente (POST):

Digitar a url abaixo:

URL: http://localhost:8090/clientes/

Payload: No body do Postman, incluir o JSON abaixo e clicar no botão "Send":

```json
{
    "nome":"Marcelo",
    "cpf":"43854029810",
    "email":"marcelo.rodrigues@netshoes.com"
}
```

Retorno esperado de exemplo:

```json
{
    "id": "1",
    "nome": "Marcelo",
    "cpf": "43854029810",
    "email": "marcelo.rodrigues@netshoes.com"
}
```

### Alterar Cliente (PUT):

Digitar a url abaixo:

URL: http://localhost:8090/clientes/

Payload: No body do Postman, incluir o JSON referente ao cliente que deseja atualizar e clicar no botão "Send":

```json
{
    "id": "1",
    "nome": "Marcelo Rodrigues Alves de Oliveira",
    "cpf": "43854029810",
    "email": "marcelo.oliveira@netshoes.com"
}
```

Retorno esperado de exemplo:

```json
{
    "id": "1",
    "nome": "Marcelo Rodrigues Alves de Oliveira",
    "cpf": "43854029810",
    "email": "marcelo.oliveira@netshoes.com"
}
```

### Excluir Cliente (DELETE):

Digitar a url abaixo e incluindo na url qual é o id do cliente que deseja excluir e clicar no botão "Send":
http://localhost:8090/clientes/1

Por se tratar de um método void, este não tem retorno.

### Consultar um Cliente (GET):

Digitar a url abaixo e incluindo na url qual é o id do cliente que deseja consultar e clicar no botão "Send":

URL: http://localhost:8090/clientes/1

Retorno esperado de exemplo:

```json
{
    "id": "1",
    "nome": "Marcelo Rodrigues Alves de Oliveira",
    "cpf": "43854029810",
    "email": "marcelo.oliveira@netshoes.com"
}
```

### Listar todos os Clientes (GET):

Digitar a url abaixo e clicar no botão "Send":

URL: http://localhost:8090/clientes/

Retorno esperado de exemplo:

```json
[
    {
        "id": "1",
        "nome": "Marcelo Rodrigues Alves de Oliveira",
        "cpf": "43854029810",
        "email": "marcelo.oliveira@netshoes.com"
    },
    {
        "id": "2",
        "nome": "João da SIlva",
        "cpf": "53264597820",
        "email": "joao.silva@netshoes.com"
    },
    {
        "id": "3",
        "nome": "Angel Romero",
        "cpf": "53126548562",
        "email": "angel.romero@netshoes.com"
    },
    {
        "id": "4",
        "nome": "Carlos Tevez",
        "cpf": "55526426489",
        "email": "carlitos.tevez@netshoes.com"
    }
]
```

