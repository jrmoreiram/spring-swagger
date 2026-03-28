# 🚀 Spring Swagger

![Swagger Documentation](images/Introduction.png?raw=true)

## 📋 Visão Geral

**Spring Swagger** é um projeto de demonstração que implementa uma API REST utilizando **Spring Boot** com documentação interativa gerada automaticamente pelo **Swagger (OpenAPI)**. Este projeto exemplifica boas práticas de desenvolvimento de APIs em Java, incluindo documentação, persistência de dados e testes.

## 🛠️ Tecnologias Utilizadas

### Dependências Principais

- **Spring Boot 2.3.1** - Framework para desenvolvimento rápido de aplicações Java
- **Spring Data JPA** - Abstração para persistência de dados com Hibernate
- **Spring Web** - Módulo para desenvolvimento de aplicações web e APIs REST
- **Swagger UI 2.10.5** - Interface interativa para documentação da API
- **Springfox 2.10.5** - Integração entre Spring e Swagger
- **Lombok** - Redução de boilerplate code (getters, setters, construtores)
- **H2 Database** - Banco de dados em memória para desenvolvimento e testes
- **Spring Boot DevTools** - Ferramentas para desenvolvimento com hot-reload

## 📦 Estrutura do Projeto

```
spring-swagger/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/junior/          # Pacote raiz da aplicação
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml                          # Configuração Maven
├── mvnw / mvnw.cmd                  # Maven Wrapper
└── README.md                        # Este arquivo
```

## 📋 Requisitos do Sistema

- **Java**: 1.8 ou superior
- **Maven**: 3.6 ou superior
- **Git**: Para controle de versão

## 🚀 Instalação e Configuração

### 1. Clonar o Repositório

```bash
git clone https://github.com/jrmoreiram/spring-swagger.git
cd spring-swagger
```

### 2. Instalar Dependências

```bash
# Usando Maven
mvn clean install

# Ou usando Maven Wrapper (Linux/Mac)
./mvnw clean install

# Ou usando Maven Wrapper (Windows)
mvnw.cmd clean install
```

### 3. Configurar a Aplicação

O arquivo `application.properties` está localizado em `src/main/resources/`. Configure as propriedades conforme necessário:

```properties
# Configurações do servidor
server.port=8080

# Configurações do banco de dados H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## ▶️ Executando a Aplicação

### Usando Maven

```bash
# Executar a aplicação
mvn spring-boot:run
```

### Usando IDE (IntelliJ IDEA, Eclipse, VS Code)

1. Navegue até a classe principal anotada com `@SpringBootApplication`
2. Clique em "Run" ou pressione `Shift + F10` (IntelliJ)

### Usando JAR compilado

```bash
# Compilar
mvn clean package

# Executar
java -jar target/spring-swagger-0.0.1-SNAPSHOT.jar
```

## 📚 Acessando a Documentação da API

Após iniciar a aplicação, acesse a documentação interativa do Swagger através das URLs:

- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **API JSON**: http://localhost:8080/v2/api-docs
- **Health Check**: http://localhost:8080/actuator/health

## 🔌 Endpoints Disponíveis

### Padrão de Requisições

Todos os endpoints seguem o padrão RESTful:

| Método | Operação |
|--------|----------|
| GET | Recuperar recursos |
| POST | Criar novo recurso |
| PUT | Atualizar recurso existente |
| DELETE | Remover recurso |

### Exemplo de Documentação de Endpoint

Cada endpoint está documentado com:
- Descrição clara da funcionalidade
- Parâmetros de entrada
- Códigos de resposta HTTP
- Exemplos de payload

## 💾 Banco de Dados

### H2 Database

O projeto utiliza **H2 Database** em modo in-memory para desenvolvimento e testes:

- **Console H2**: http://localhost:8080/h2-console
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Usuário**: sa
- **Senha**: (deixar em branco)

### Configuração de Persistência

A persistência é gerenciada através do **Spring Data JPA** com as seguintes configurações:

```properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas:

```
Requisição HTTP
      ↓
   Controller (REST)
      ↓
   Service (Lógica de Negócio)
      ↓
   Repository (Acesso a Dados)
      ↓
   Entity (Modelo de Dados)
      ↓
   Banco de Dados (H2)
```

## 📝 Principais Componentes

### Controllers
Responsáveis por receber requisições HTTP e retornar respostas.

### Services
Contêm a lógica de negócio da aplicação.

### Repositories
Interfaces que gerenciam o acesso aos dados usando Spring Data JPA.

### Entities
Classes que representam as tabelas do banco de dados.

## 🧪 Testando a API

### Usando cURL

```bash
# GET - Listar recursos
curl -X GET http://localhost:8080/api/recursos

# POST - Criar novo recurso
curl -X POST http://localhost:8080/api/recursos \
  -H "Content-Type: application/json" \
  -d '{"nome": "Exemplo", "descricao": "Descrição do exemplo"}'
```

### Usando Postman

1. Importe a coleção do Swagger em `http://localhost:8080/v2/api-docs`
2. Execute as requisições através da interface do Postman

## 🔍 Solução de Problemas

### Problema: "Port 8080 already in use"

**Solução**: Altere a porta no `application.properties`:
```properties
server.port=8081
```

### Problema: "Bean creation failed"

**Solução**: Certifique-se de que todas as dependências estão instaladas:
```bash
mvn clean install
```

### Problema: H2 Console não acessível

**Solução**: Adicione a configuração no `application.properties`:
```properties
spring.h2.console.enabled=true
```

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir com este projeto:

1. **Fork** o repositório
2. **Crie uma branch** para sua feature:
   ```bash
   git checkout -b feature/MinhaFeature
   ```
3. **Commit** suas alterações:
   ```bash
   git commit -m 'Adiciona MinhaFeature'
   ```
4. **Push** para a branch:
   ```bash
   git push origin feature/MinhaFeature
   ```
5. **Abra um Pull Request** descrevendo suas mudanças

### Diretrizes de Contribuição

- Siga o estilo de código existente
- Adicione testes para novas funcionalidades
- Atualize a documentação conforme necessário
- Faça commits com mensagens claras e descritivas

## 📄 Licença

Este projeto está licenciado sob a **MIT License** - veja o arquivo `LICENSE` para detalhes.

## 👨‍💻 Autor

**Junior Moreira Martins** - [GitHub](https://github.com/jrmoreiram)

## 📞 Suporte

Para dúvidas, sugestões ou reportar bugs, abra uma **Issue** no repositório.

## 🔗 Links Úteis

- [Documentação Spring Boot](https://spring.io/projects/spring-boot)
- [Documentação Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Documentação Swagger/OpenAPI](https://swagger.io/)
- [Documentação Lombok](https://projectlombok.org/)

---

**Última atualização**: 28/03/2026
