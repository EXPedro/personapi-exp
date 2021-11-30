# API Rest para cadastro e gerenciamento de pessoas  

:man::person_white_hair::woman::mechanic::person_bald::woman_mechanic: API Rest desenvolvida para realizar operações de __CRUD__ para cadastro e gerenciamento de pessoas em uma organização.

### :hammer_and_wrench: Ferramentas utilizadas:

[<img src = "https://encurtador.com.br/iuCOQ" width = "auto" height = "28px">]()
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white) 
[<img src = "https://encurtador.com.br/gmCFQ" width = "auto" height = "28px">](https://encurtador.com.br/gmCFQ)
[![Heroku](https://img.shields.io/badge/heroku-%23430098.svg?style=for-the-badge&logo=heroku&logoColor=white)](https://personapi555.herokuapp.com/api/v1/people)

- Utilização do padrão __DTO__
- Validação de __CPF__
- Uso de testes unitários __JUnit__  

### :cloud: Hospedado no Heroku no endereço:

```$xslt
https://personapi555.herokuapp.com/api/v1/people
```

Sugestão de utilização do [__Postman__](https://www.postman.com/) como frontend, para testar os métodos __CRUD__ implementados no projeto


### :sun_with_face: A estrutura de dados no JSON deve ser

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
:green_circle: Projeto concluído em __08/2021__
