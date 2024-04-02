# Case1 - API REST com Spring Boot e Docker

Este repositório contém uma aplicação simples de serviço web desenvolvida utilizando o Spring Boot e o Docker. O serviço web fornece uma API REST básica para manipular dados de uma entidade Produto.

## Funcionalidades da API ⚙️
A API desenvolvida oferece as seguintes funcionalidades:

- **Cadastro de Produtos** 📝
  - Os usuários podem cadastrar novos produtos fornecendo informações como nome, descrição e preço.
  
- **Listagem de Produtos** 📋
  - Os produtos cadastrados podem ser listados para visualização.

- **Atualização de Produtos** 🔄
  - Os usuários podem atualizar as informações de um produto existente.

- **Remoção de Produtos** ❌
  - Produtos podem ser removidos da base de dados.

## Como Executar o Projeto ▶️

Para rodar este projeto localmente, siga os passos abaixo:

1. Clone este repositório em sua máquina:

   ```bash
   git clone https://github.com/ander-alves/CaseJava1
   ```

Navegue até o diretório do projeto:
   ```bash
   cd CaseJava1
   ```
Execute o Docker Compose para configurar o ambiente:

 ```bash
docker-compose up --build -d
```
Acesse a documentação da API disponível no Swagger em seu navegador:

http://localhost:8080/swagger-ui/

## Estrutura do Projeto 📁

O projeto segue a seguinte estrutura:

- **src/main/java**: Contém o código-fonte da aplicação.
- **src/main/resources**: Contém arquivos de configuração e propriedades.
- **src/test/java**: Contém os testes unitários da aplicação.
- **Dockerfile**: Arquivo de configuração do Docker para a aplicação.
- **docker-compose.yml**: Arquivo de configuração do Docker Compose para rodar a aplicação e o banco de dados PostgreSQL.

## Tecnologias Utilizadas 💻

- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Docker**: Plataforma para desenvolvimento, envio e execução de aplicativos.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional.

## Contribuidores 👥

- [Anderson Alves](https://github.com/ander-alves)

## Considerações Finais 🏁

Este repositório contém a aplicação completa desenvolvida como parte do desafio Case1. A API oferece operações básicas para gerenciamento de produtos, seguindo as práticas recomendadas de desenvolvimento.

