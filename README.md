# ramengo-api

Esta documentação descreve a arquitetura e os detalhes de implementação de um projeto Java (Maven) usando o framework Spring Boot e hospedada na [Railway](https://railway.app/).

## Visão Geral

O projeto segue a arquitetura MVC (Model-View-Controller) para garantir a separação clara de preocupações e facilitar a manutenção e testabilidade do código. Ele é dividido em três camadas principais:

1. **Model**: A camada de modelo contém as regras de negócios e a lógica de dados do sistema. Ela representa os dados e os comportamentos que a aplicação manipula.

2. **View**: A camada de visualização é responsável por apresentar os dados ao usuário. Ela recebe as informações da camada de modelo e exibe de uma maneira compreensível e interativa.

3. **Controller**: A camada de controle gerencia a comunicação entre as camadas de modelo e visualização. Ela recebe as entradas dos usuários, processa-as através da camada de modelo e atualiza a visualização conforme necessário.

## Configuração das Variáveis de Ambiente

Para configurar corretamente seu ambiente, você precisa definir as variáveis de ambiente necessárias. Para fazer isso é necessário alterar algumas variáveis em `application.properties`. Aqui estão as variáveis de ambiente necessárias:

```env
spring.datasource.url=${URL_BANCO}
spring.datasource.username=${USERNAME_BANCO}
spring.datasource.password=${PASSWORD_BANCO}

server.port=${PORTA_SERVIDOR}

x-api-key=${X_API_KEY}
order-api-path=${ORDER_API_PATH}
ramen-image-path=${RAMEN_IMAGE_PATH} (imagem resultante apos criar um pedido, normalmente essa: https://tech.redventures.com.br/icons/ramen/ramenChasu.png)

```

## Configuração do Ambiente de Desenvolvimento

### Instalação do `IntelliJ`(Opcional)

O `IntelliJ` é uma ferramenta poderosa e amplamente utilizada para o desenvolvimento em Java. Ele simplifica a configuração de ambientes de desenvolvimento e oferece suporte abrangente para a resolução de problemas relacionados a configurações de projeto. A instalação do IntelliJ pode facilitar significativamente a gestão de projetos Java, automatizando muitas configurações e fornecendo sugestões para resolver problemas de configuração pendentes.

#### Passo 1: Instale o Java (se necessário)

Se você ainda não tem o Java instalado no seu sistema, faça o download e instale o [Java Development Kit (JDK) 17](https://www.oracle.com/java/technologies/downloads/#java17), a partir do site oficial do Oracle. Certifique-se de "Adicionar ao PATH" durante a instalação.

#### Passo 2: Configure o seu banco de dados `PostgreSQL`

Após ter o Java instalado, use o seu SGBD(Sistema gereniador de Banco de dados) para configurar semelhante as variáveis previamente definidas no `application.properties` para seu banco:

#### Passo 3: Execute sua applicacao

Caso esteja utilizando o VScode ou IntelliJ como IDE basta clicar no botao de executar, mas caso deseje utilizar o prórpio terminal basta executar o seguinte comando

```env
mvn clean install
```

Este comando irá limpar qualquer build anterior e construir o projeto, baixando todas as dependências necessárias. Ainda no terminal, execute o comando:

```env
mvn spring-boot:run
```

### Tecnologias utilizadas

- [Spring Boot](https://spring.io/projects/spring-boot)

- [PostgresQL](https://www.postgresql.org)

- [Java](https://www.java.com/pt-BR/)

- [Maven](https://maven.apache.org/)

- [Railway](https://railway.app/)

- [Docker](https://www.docker.com/)
