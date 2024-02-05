## Sumário

1. [Descrição](#descricao)
2. [Tecnologias utilizadas](#tecnologias)
3. [Documentação da API](#documentacao)
4. [Autor](#autor)
5. [Créditos](#creditos)
6. [Licença](#licenca)

<div id='descricao'/> 

## 1. Descrição

O projeto é uma API REST desenvolvida com Spring Boot e MySQL para gerenciar informações sobre filmes. A API permite realizar operações como adicionar, atualizar, excluir e consultar dados de filmes em uma base de dados. A motivação é fornecer uma interface de back-end robusta e eficiente para manipular essas informações. Isso pode ser útil para desenvolvedores front-end que estão construindo aplicações web que necessitam de uma API para armazenamento e recuperação de dados de filmes.

<div id='tecnologias'/> 

## 2. Tecnologias utilizadas

- [Java](https://www.java.com/pt-BR/download/help/whatis_java.html)
- [Maven](https://maven.apache.org/)
- [Spring Framework](https://spring.io/)
- [MySQL](https://www.mysql.com/)
- [Insomnia](https://insomnia.rest/)
- [Docker](https://www.docker.com/)
- [Render](https://render.com/)
- [Railway](https://railway.app/)

### 2.1 Modelo Conceitual

![modelo-conceitual](https://github.com/Tomaz5556/API-REST-com-BD/blob/master/images/modelo-conceitual.png)

<div id='documentacao'/> 

## 3. Documentação API

### 3.1 End-Points

URL API: https://apitestbdfilme.onrender.com/

#### 1. Cadastrar Filme

**[POST] /filme**

```
{
	"nome": "Napoleão",
	"diretor": "David Scarpa",
	"ano": 2023
}
```

![cadastrar](https://github.com/Tomaz5556/API-REST-com-BD/blob/master/images/cadastrar.png)

#### 2. Atualizar Filme por ID

**[PUT] /filme/1**

```
{
	"nome": "Django Livre",
	"diretor": "Quentin Tarantino",
	"ano": 2012
}
```

![atualizar](https://github.com/Tomaz5556/API-REST-com-BD/blob/master/images/atualizar.png)

#### 3. Excluir Filme por ID

**[DELETE] /filme/3**

![excluir](https://github.com/Tomaz5556/API-REST-com-BD/blob/master/images/excluir.png)

#### 4. Listar Filmes

**[GET] /filme**

![listar](https://github.com/Tomaz5556/API-REST-com-BD/blob/master/images/listar.png)

#### 5. Buscar Filme por ID

**[GET] /filme/1**

![buscar](https://github.com/Tomaz5556/API-REST-com-BD/blob/master/images/buscar.png)
  
<div id='autor'/>

## 4. Autor

### Tomaz Martins Batista

<div id='creditos'/> 

## 5. Créditos

- [Cleyson Lima](https://www.treinaweb.com.br/blog/criando-uma-api-com-spring-data-jpa-e-spring-web)

<div id='licenca'/> 

## 6. Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE.md) para mais detalhes.
