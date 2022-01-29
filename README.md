# API de Funcionários - Projeto Final DIO

Esse repositório contém o projeto final do Bootcamp GFT Starter, na plataforma Digital Innovation One.  
As orientações do professor que indicou o projeto, era criar algo explorando padrões de projeto em Java puro ou em Spring.

Escolhi produzir uma API de gerenciamento de funcionários em uma empresa utilizando Spring (devido à minha familiaridade com o 
framework).  


## Endpoints
Essa API Rest é simples e possui os seguintes endpoints:

GET - `/api/v1/employee` -> Encontra todos os funcionários da empresa.

GET - `/api/v1/employee/{id}` -> Encontra um funcionário específico.

POST - `/api/v1/employee` -> Permite a criação de um novo funcionário com os seguintes parâmetros:  
```
{  
    "name": "Maria Blue",  
    "email": "maria@gmail.com",  
    "department": {  
        "id": 1  
    },  
    "salary": 5560.00  
}
```  
<hr>

GET - `/api/v1/department` -> Encontra todos os departamentos da empresa.

GET - `/api/v1/department/{id}` -> Encontra um departamento específico.

POST - `/api/v1/department` -> Permite a criação de um novo departamento com os seguintes parâmetros:  
```
{  
    "name": "Marketing"
}
```  


## Como rodar

Para rodar o projeto, é necessário:
- Criar no PostgreSQL uma nova tabela vazia com o nome `employees`.  
- Alterar o arquivo `application.properties` para os seus dados (porta do banco de dados, senha, etc).
- Rodar a aplicação Spring pelo terminal usando o maeven ou pela sua IDE compatível com o Spring - Intellij IDEA, STS.. (caminho mais simples).
