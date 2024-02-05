## Sumário

1. [Descrição](#descricao)
2. [Tecnologias utilizadas](#tecnologias)
3. [Documentação da API](#documentacao)
4. [Autor](#autor)
5. [Créditos](#creditos)
6. [Licença](#licenca)

<div id='descricao'/> 

## 1. Descrição

O projeto é uma API REST desenvolvida com Spring Boot e MySQL para gerenciar informações sobre filmes. A API permite que os usuários realizem operações CRUD (Criar, Ler, Atualizar e Deletar) em uma base de dados de filmes. O objetivo deste projeto é fornecer uma interface de back-end robusta e eficiente para manipular dados de filmes. Isso pode ser útil para desenvolvedores de front-end que estão construindo aplicações web ou móveis que necessitam de um back-end para armazenamento e recuperação de dados de filmes.

<div id='tecnologias'/> 

## 2. Tecnologias utilizadas

- Java
- Maven
- Spring Framework
- MySQL
- Insomnia
- Docker
- Render
- Railway

### 2.1 Modelo Conceitual

![modelo-conceitual](https://github.com/Tomaz5556/GraphQLMiniProjetoWEB/blob/master/images-tutorial/modelo-conceitual.png)

<div id='documentacao'/> 

## 3. Documentação da API

### 3.1 End-Points

URL API: https://minhaapi.vercel.app

#### 1. Cadastrar Filme

**[POST] /filme**

```
{
	"nome": "Napoleão",
	"diretor": "David Scarpa",
	"ano": 2023
}
```

![cadastrar](https://github.com/Tomaz5556/GraphQLMiniProjetoWEB/blob/master/images-tutorial/cadastrar.png)

#### 2. Atualizar Filme por ID

**[PUT] /filme/1**

```
{
	"nome": "Django Livre",
	"diretor": "Quentin Tarantino",
	"ano": 2012
}
```

![atualizar](https://github.com/Tomaz5556/GraphQLMiniProjetoWEB/blob/master/images-tutorial/atualizar.png)

#### 3. Excluir Filme por ID

**[DELETE] /filme/3**

![excluir](https://github.com/Tomaz5556/GraphQLMiniProjetoWEB/blob/master/images-tutorial/excluir.png)

#### 4. Listar Filmes

**[GET] /filme**

![listar](https://github.com/Tomaz5556/GraphQLMiniProjetoWEB/blob/master/images-tutorial/listar.png)

#### 5. Buscar Filme por ID

**[GET] /filme/1**

![buscar](https://github.com/Tomaz5556/GraphQLMiniProjetoWEB/blob/master/images-tutorial/buscar.png)
  
<div id='autor'/>

## 4. Autor

**Tomaz Martins Batista**

<div id='creditos'/> 

## 5. Créditos

- [Cleyson Lima](https://www.treinaweb.com.br/blog/criando-uma-api-com-spring-data-jpa-e-spring-web)

<div id='licenca'/> 

## 6. Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE.md) para mais detalhes.
