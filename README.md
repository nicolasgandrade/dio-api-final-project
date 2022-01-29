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


## Screenshots
### POST de novo funcionário e o retorno ao cliente
![Screenshot from 2022-01-29 18-00-58](https://user-images.githubusercontent.com/82426254/151677446-81d18ba7-c266-4e15-8cac-c6abad648259.png)

### POST de novo departamento e o retorno ao cliente
![Screenshot from 2022-01-29 18-03-27](https://user-images.githubusercontent.com/82426254/151677501-aab2990b-cad2-4c22-986b-8f42f1ed490e.png)

### GET em departments
![Screenshot from 2022-01-29 18-04-54](https://user-images.githubusercontent.com/82426254/151677541-03c1c266-e9f3-4b07-8ab0-b0d7cbed72f0.png)

### GET em employee
![Screenshot from 2022-01-29 18-06-16](https://user-images.githubusercontent.com/82426254/151677564-4255cfaf-3d77-4c12-9a47-a771a55517a7.png)


