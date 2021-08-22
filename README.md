API REST com Spring Boot para cadastro e gerenciamento de pessoas de uma organização, até o Deploy na nuvem (Heroku). 

Projeto desenvolvido na Digital Innovation One, sob orientação do especialista 
[Rodrigo Peleias](https://www.linkedin.com/in/rodrigopeleias/), durante o *bootcamp* do Banco Santander.

No Heroku, o endereço do projeto é:
```$xslt
https://personapi555.herokuapp.com/api/v1/people
```
Com o [Postman](https://www.postman.com/), pode-se simular os métodos CRUD do projeto através deste endereço.
A estrutura de dados no JSON (com cpf válido) deve ser :

```
{
    "firstName":"firstName",
    "lastName":"lastName",
    "cpf":"999.999.999-99",
    "birthDate" : "dd-MM-yyyy",
    "phones":[
        {
            "type":"MOBILE",
            "number":"(99)99999-9999"
        }
    ]
}
```
Durante o projeto foi aprimorado o conhecimento nas seguintes tecnologias:

- Maven (inserção de dependências),
- Spring, lombok, MapStruct e *annotations* relacionados,
- Criação de interfaces, de conceitos como utilização de *data transfer objects* (DTOs),
- Introdução a testes unitários,
- Uso das ferramentas do Github,

&nbsp;
> Concluido em 08/2021.