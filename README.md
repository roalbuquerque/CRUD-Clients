# CRUD Clients
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/roalbuquerque/Crud-clientes/blob/master/LICENSE) 

# Sobre o projeto

⚡ O "CRUD clients" é um projeto Spring Boot 2.4.x com um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas a seguir:
- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso


## Modelo conceitual
![Modelo Conceitual](https://github.com/roalbuquerque/CRUD-clientes/blob/master/assets/ModeloConceitualCrudClients.png)

## Seed de banco de dados
![Modelo Conceitual](https://github.com/roalbuquerque/CRUD-clientes/blob/master/assets/SeedDeBanco01.png)

### Exemplo:
```bash

INSERT INTO tb_client (name, cpf, income, birth_Date, children, created_At) 
VALUES ('Maria Silva', 12345678901, 6500.0, TIMESTAMP WITH TIME ZONE '1994-07-20T10:30:00Z', 2, NOW());

```


# Tecnologias utilizadas
#### Back end
- Java 11
- Spring Boot
- JPA / Hibernate
- Maven
#### Banco de dados 
- H2
#### Ferramenta de apoio
- Postman
#### Recursos
- Seed de base de dados

# Como executar o projeto

```bash
# clonar repositório
git clone git@github.com:roalbuquerque/CRUD-clientes.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Como testar os recursos no postman

## Busca paginada de clientes
```
GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name
```
## Busca de cliente por id
```
GET /clients/1
```
## Inserção de novo cliente
```
POST /clients
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```
## Atualização de cliente
```
PUT /clients/1
{
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```
## Deleção de cliente
```
DELETE /clients/1
```

# Autor

Rafael de Oliveira Albuquerque

📫 Você pode me encontrar aqui:
<p align="left">
  <a href="https://www.linkedin.com/in/rafaeloliveiraalbuquerque/" alt="Linkedin">
  <img src="https://img.shields.io/badge/-Linkedin-0e76a8?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/rafaeloliveiraalbuquerque/" /></a>



